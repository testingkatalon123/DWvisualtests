import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lightning.app.solverglobal.com/')

WebUI.setText(findTestObject('Object Repository/Page_Solver/input_Email_email'), 'mkim@solverglobal.com')

WebUI.click(findTestObject('Object Repository/Page_Solver/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Solver/input_Password_model.Password'), 'nBAqZCBhT5nQHzNSyI4ifQ==')

WebUI.click(findTestObject('Page_Solver/ng-transclude_Next'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Home - Solver/div_Mindy_Corporate_Demo_osr-user-menu__but_ac061f'), 
    10)

WebUI.click(findTestObject('Object Repository/Page_Home - Solver/div_Mindy_Corporate_Demo_osr-user-menu__but_ac061f'))

WebUI.click(findTestObject('Object Repository/Page_Home - Solver/p_Tenants'))

WebUI.click(findTestObject('Object Repository/Page_Home - Solver/p_Mindy_Corporate_Demo'))

'makes sure tenant is Mindy_Corp_Demo'
WebUI.click(findTestObject('Object Repository/Page_Home - Solver/svg_Mindy_Corporate_Demo_icon icon--light'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Home - Solver/h1_Welcome, Mindy Kim'), 0)

WebUI.takeFullPageScreenshotAsCheckpoint('HomePage', [])

WebUI.click(findTestObject('Object Repository/Page_Home - Solver/svg_Mindy_Corporate_Demo_icon icon--light'))

'Goes to DataWarehouse'
WebUI.click(findTestObject('Object Repository/Page_Home - Solver/div_Data Warehouse'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Overview - Solver/span_Accounts Payable'), 5)

'Goes to Dimension overview'
WebUI.click(findTestObject('Object Repository/Page_Overview - Solver/button_Dimensions'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_Overview - Solver/a_Settings_menu-toggle'))

WebUI.takeFullPageScreenshotAsCheckpoint('DimensionOverview')

WebUI.click(findTestObject('Object Repository/Page_Overview - Solver/a_Settings_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Overview - Solver/a_Currency'))

WebUI.click(findTestObject('Object Repository/Page_Overview - Solver/a_Rate Types'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Rate Types - Solver/div_Rate Type'), 10)

WebUI.takeFullPageScreenshotAsCheckpoint('RateType')

'Goes to Monthly Rates'
WebUI.click(findTestObject('Object Repository/Page_Rate Types - Solver/a_Monthly Rates'))

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Page_Monthly Rates - Solver/SelectRateType'), 0)

WebUI.takeFullPageScreenshotAsCheckpoint('MonthlyRateEmpty')

'Selecting AVG'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Monthly Rates - Solver/select_Rate TypeAVGBUDCLSCSACTCSOBAICACTICO_fe3f1e'), 
    'AVG', true)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Monthly Rates - Solver/div_Period'), 10)

WebUI.takeFullPageScreenshotAsCheckpoint('MonthlyRateAVG')

WebUI.click(findTestObject('Object Repository/Page_Monthly Rates - Solver/a_Rate Configuration'))

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshotAsCheckpoint('RateConfiguration')

'Goes to Data'
WebUI.click(findTestObject('Object Repository/Page_Rate Configuration - Solver/a_Data'))

'Data > Integrations'
WebUI.click(findTestObject('Object Repository/Page_Rate Configuration - Solver/a_Integrations'))

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshotAsCheckpoint('Integrations')

'Data > Rules'
WebUI.click(findTestObject('Object Repository/Page_Integrations - Solver/a_Rules'))

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshotAsCheckpoint('Rules')

'Goes to Jobs'
WebUI.click(findTestObject('Object Repository/Page_Rules - Solver/a_Jobs'))

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Page_Jobs - Solver/div_Name'), 5)

WebUI.takeFullPageScreenshotAsCheckpoint('Jobs')

WebUI.click(findTestObject('Object Repository/Page_Jobs - Solver/a_Event Log'))

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Page_Event Log - Solver/div_Name'), 5)

WebUI.takeFullPageScreenshotAsCheckpoint('EventLog')

WebUI.click(findTestObject('Object Repository/Page_Event Log - Solver/a_Configuration'))

WebUI.click(findTestObject('Object Repository/Page_Event Log - Solver/a_Period Configuration'))

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshotAsCheckpoint('PeriodConfig')

