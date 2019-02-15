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

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_SKIP (6)'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/h5_Dashboard (1)'))

WebUI.delay(11)

WebUI.click(findTestObject('Page_DEUK-Workspace/a_Token login (1)'))

WebUI.setText(findTestObject('Page_DEUK-Workspace/input_Dashboard_token (1)'), 'fKQnwnxDJa*RKa*')

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Submit (3)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/h5_Home (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_My Workspace (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/h5_My profile'))

WebUI.delay(4)

WebUI.scrollToPosition(0, 900)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Year 2_comet-form__checkb'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Year 3_comet-form__checkb'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Maths_comet-form__checkbo'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Update (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(6)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DEUK-Workspace/div_You have successfully upda'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/h5_My profile'))

WebUI.delay(4)

WebUI.scrollToPosition(0, 900)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Year 2_comet-form__checkb'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Year 3_comet-form__checkb'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Maths_comet-form__checkbo'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Update (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(6)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DEUK-Workspace/div_You have successfully upda'), 0)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/h5_My profile'))

WebUI.delay(4)

WebUI.scrollToPosition(0, 900)

WebUI.verifyElementPresent(findTestObject('Page_DEUK-Workspace/span_Year 2_comet-form__checkb'), 0)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_DEUK-Workspace/span_Year 3_comet-form__checkb'), 0)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_DEUK-Workspace/span_Maths_comet-form__checkbo'), 0)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/h5_Home (1)'))

WebUI.delay(3)

WebUI.closeBrowser()

