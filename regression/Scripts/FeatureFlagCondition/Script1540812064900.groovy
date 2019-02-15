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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_DEUK-Workspace/button_SKIP'))

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/h5_Dashboard (1)'))

WebUI.delay(11)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Token login (1)'))

WebUI.setText(findTestObject('Object Repository/Page_DEUK-Workspace/input_Dashboard_token (1)'), 'fKQnwnxDJa*RKa*')

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Submit (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/h5_Feature-Flags Dashboard'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_(component)_comet-form__c'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Update'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(7)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/h5_Home (1)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_DEUK-Workspace/input_Start searching to find (3)'), 'cow')

WebUI.click(findTestObject('Page_DEUK-Workspace/button'))

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DEUK-Workspace/div_ESPRESSO'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_My Workspace'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/h5_Feature-Flags Dashboard'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_(component)_comet-form__c'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Update'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(7)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/h5_Home (1)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_DEUK-Workspace/input_Start searching to find (3)'), 'cow')

WebUI.click(findTestObject('Page_DEUK-Workspace/button'))

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DEUK-Workspace/a_More information'), 0)

WebUI.closeBrowser()

