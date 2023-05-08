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

WebUI.callTestCase(findTestCase('Demoblaze/LoginDemoblaze'), [('url') : 'https://www.demoblaze.com/index.html', ('username') : 'qatb_demo1'
        , ('password') : 'o+tS4OuGt32s9ezZj287yw=='], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Demoblaze/AddToCartDemoblaze'), [('product') : 'Samsung galaxy s6'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Name_name'), username)

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Country_country'), country)

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_City_city'), city)

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Credit card_card'), creditCardNo)

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Month_month'), month)

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Year_year'), year)

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Purchase'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/h2_Thank you for your purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_STORE/button_OK'))

WebUI.closeBrowser()

