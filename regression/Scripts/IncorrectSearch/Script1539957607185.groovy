import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://workspace-qa.discoveryeducation.co.uk/on-boarding')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_SKIP (2)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/h5_Home (1)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_DEUK-Workspace/input_Start searching to find (3)'), 'addotion')

WebUI.click(findTestObject('Page_DEUK-Workspace/button'))

WebUI.verifyElementPresent(findTestObject('Page_DEUK-Workspace/h4_Did you mean'), 2)

WebUI.delay(5)

WebUI.closeBrowser()

