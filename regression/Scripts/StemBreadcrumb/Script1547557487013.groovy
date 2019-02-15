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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_DEUK-Workspace/button_SKIP'))

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources'))

WebUI.click(findTestObject('Page_DEUK-Workspace/a_Dashboard'))

WebUI.delay(11)

WebUI.click(findTestObject('Page_DEUK-Workspace/a_Token login'))

WebUI.setText(findTestObject('Page_DEUK-Workspace/input_Dashboard_token'), 'fKQnwnxDJa*RKa*')

WebUI.click(findTestObject('Page_DEUK-Workspace/button_Submit'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_DEUK-Workspace/li_STEM Connect'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_DEUK-Workspace/a_Go to STEM Connect homepage'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Foundation  KS1'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/a_Challenge'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Foundation and KS1'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_STEM Connect'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Lower KS2'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_STEM Connect'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Upper KS2'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_STEM Connect'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_KS3'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/a_STEM Connect'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_My Workspace'))

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/a_Home'))

WebUI.closeBrowser()

