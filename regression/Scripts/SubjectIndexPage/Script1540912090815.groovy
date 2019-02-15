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

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_SKIP (5)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/h5_Dashboard (1)'))

WebUI.delay(11)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Token login (2)'))

WebUI.setText(findTestObject('Object Repository/Page_DEUK-Workspace/input_Dashboard_token (2)'), 'fKQnwnxDJa*RKa*')

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/button_Submit (2)'))

WebUI.delay(7)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/li_Espresso'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_English'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_DEUK-Workspace/h3_KS1'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/li_Espresso'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Science'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/p_Whatever the weather'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/li_Espresso'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_English'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/p_World Book Day'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/li_Espresso'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_History'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/li_Espresso'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Maths'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/p_Place value'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/li_Espresso'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Art and design'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/li_Espresso'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Geography'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/p_Brazil'))

WebUI.scrollToPosition(0, 900)

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(7)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.click(findTestObject('Page_DEUK-Workspace/li_Espresso'))

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/a_Science'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/p_Materials'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/label_image (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/p_frontscreen.jpg'))

WebUI.delay(4)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/p_frontscreen.jpg'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEUK-Workspace/span_Worksheets'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/span_Explore our resources (3)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DEUK-Workspace/h5_Home (1)'))

WebUI.closeBrowser()

