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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demobank.jaktestowac.pl/logowanie_etap_1.html')

WebUI.setText(findTestObject('Object Repository/Page_Demobank - Bankowo Internetowa - Logowanie/input_identyfikator_login_id'), 
    '11111111')

WebUI.click(findTestObject('Object Repository/Page_Demobank - Bankowo Internetowa - Logowanie/button_dalej'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demobank - Bankowo Internetowa - Logowanie/input_haso_haslo'), 
    'ecCRzUxU9HjdN8UwUTlBbA==')

WebUI.click(findTestObject('Object Repository/Page_Demobank - Bankowo Internetowa - Logowanie/button_zaloguj si'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demobank - Bankowo Internetowa - Pulpit/select_wybierz odbiorc przelewu            _029a71'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_Demobank - Bankowo Internetowa - Pulpit/input_kwota_widget_1_transfer_amount'))

WebUI.click(findTestObject('Object Repository/Page_Demobank - Bankowo Internetowa - Pulpit/div_mj pulpit                              _aa29b7'))

WebUI.setText(findTestObject('Object Repository/Page_Demobank - Bankowo Internetowa - Pulpit/input_kwota_widget_1_transfer_amount'), 
    '100')

WebUI.click(findTestObject('Object Repository/Page_Demobank - Bankowo Internetowa - Pulpit/input_tytuem_widget_1_transfer_title'))

WebUI.click(findTestObject('Object Repository/Page_Demobank - Bankowo Internetowa - Pulpit/button_wykonaj'))

WebUI.click(findTestObject('Object Repository/Page_Demobank - Bankowo Internetowa - Pulpit/a_Wyloguj'))

WebUI.closeBrowser()

