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

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_SKIP (7)'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Explore our resources (4)'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Dashboard'))

WebUI.delay(11)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Token login (4)'))

WebUI.setText(findTestObject('Object Repository/Page_DEUK-Workspace/input_Dashboard_token (4)'), 'fKQnwnxDJa*RKa*')

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Submit (4)'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_My Workspace (2)'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Folder (12)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/p_EDIT and NORMAL VIEW'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_image (15)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_video (3) - Copy'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_activity (2)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_worksheet (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_All (21)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 900)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Explore our resources (4)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Dashboard'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Logout (1)'))

WebUI.delay(4)

WebUI.navigateToUrl('https://workspace-qa.discoveryeducation.co.uk/folder/5c066a33d1f5780a40a25bee')

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_image (15)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_video (3)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_activity (2)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_worksheet (1) - Copy'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_All (21)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Explore our resources (4)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Token login (4)'))

WebUI.setText(findTestObject('Object Repository/Page_DEUK-Workspace/input_Dashboard_token (4)'), 'fKQnwnxDJa*RKa*')

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Submit (4)'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_My Workspace (2)'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Folder (12)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/p_EDIT and NORMAL VIEW'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_video (3)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_activity (2)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_worksheet (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Explore our resources (4)'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Home'))

WebUI.closeBrowser()

