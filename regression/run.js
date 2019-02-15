'use strict'

const { execFileSync } = require('child_process')
const fs = require('fs')
const https = require('https')
const path = require('path')
const tar = require('tar')
const util = require('util')
const rimraf = util.promisify(require('rimraf'))
const extractZip = util.promisify(require('extract-zip'))

const fsExists = util.promisify(fs.exists)
const fsMkdir = util.promisify(fs.mkdir)
const fsRename = util.promisify(fs.rename)
const fsReaddir = util.promisify(fs.readdir)

function downloadUrl(/** @type {string} */url, /** @type {string} */file) {
    return new Promise(resolve => {
        const stream = fs.createWriteStream(file)
        https.get(url, response => {
            response.pipe(stream)
            response.on('end', () => {
                resolve()
            })
        })
    })
}

async function download(/** @type {string} */url, /** @type {string} */baseDir) {
    const file = path.join(baseDir, path.posix.basename(url))
    if (!await fsExists(file)) {
        console.log(`Katalon Runner: Downloading ${url}...`)
        const fileTemp = `${file}.partial`
        await downloadUrl(url, fileTemp)
        await fsRename(fileTemp, file)
    }
    return file
}

async function install(/** @type {string} */url, /** @type {string} */baseDir) {
    const dir = path.join(baseDir, path.posix.basename(url).replace(/[\.a-z]+$/, ''))
    if (!await fsExists(dir)) {
        const file = await download(url, baseDir)
        console.log(`Katalon Runner: Installing ${file}...`)
        if (file.endsWith('.tar.gz')) {
            await tar.extract({
                cwd: baseDir,
                file: file,
            })
        } else if (file.endsWith('.zip')) {
            await extractZip(file, {
                dir: baseDir,
            })
        } else {
            throw new Error(`Unknown type to extract ${path.basename(file)}`)
        }
    }
    return dir
}

async function installKatalon(/** @type {string} */baseDir) {
    const url = {
        'linux': 'https://download.katalon.com/5.7.1/Katalon_Studio_Linux_64-5.7.1.tar.gz',
        'darwin': 'https://download.katalon.com/5.7.1/Katalon_Studio.dmg',
        'win32': 'https://download.katalon.com/5.7.1/Katalon_Studio_Windows_64-5.7.1.zip',
    }[process.platform] || ''
    if (!url) {
        throw new Error(`No Katalon download for platform "${process.platform}".`)
    }
    const dir = await install(url, baseDir)
    return path.join(dir, process.platform === 'win32' ? 'katalon.exe' : 'katalon')
}

async function run() {
    const katalonDir = path.join(path.dirname(__dirname), 'Local Katalon')

    if (!await fsExists(katalonDir)) {
        await fsMkdir(katalonDir)
    }

    const katalon = await installKatalon(katalonDir)

    await rimraf(path.join(__dirname, 'Reports'))

    const suites = (await fsReaddir(path.join(__dirname, 'Test Suites')))
        .filter(suiteFile => suiteFile.endsWith('.ts'))
        .map(suiteFile => path.basename(suiteFile, '.ts'))

    let errorCount = 0
    for (const suite of suites) {
        console.log(`Katalon Runner: Running test suite ${suite}...`)
        try {
            execFileSync(katalon, [
                '-noSplash',
                '-runMode=console',
                `-projectPath=${path.join(__dirname, 'Workspace.prj')}`,
                `-testSuitePath=${path.join('Test Suites', suite)}`,
                `-reportFolder=Reports/Jenkins/${suite}`,
                '-browserType=Chrome (headless)',
            ], {
                cwd: path.dirname(katalon),
            })
        } catch (error) {
            errorCount++
        }
    }

    console.log(`Katalon Runner: Done (${errorCount} suites had errors)`)
    process.exit(errorCount)
}

run().catch(error => console.error(error))
