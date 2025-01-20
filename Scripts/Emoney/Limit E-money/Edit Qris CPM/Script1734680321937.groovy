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

WebUI.click(findTestObject('Menu Utama/Button Emoney'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Emoney/Button Limit Emoney'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Emoney/Limit Emoney/Button Ubah QRIS CPM'))

WebUI.setText(findTestObject('Emoney/Limit Emoney/Input Min Nominal'), '20000')

WebUI.setText(findTestObject('Emoney/Limit Emoney/Input Max Nominal'), '20000000')

WebUI.setText(findTestObject('Emoney/Limit Emoney/Input Max Harian'), '25000000')

WebUI.setText(findTestObject('Emoney/Limit Emoney/Input Max Bulanan'), '25000000')

WebUI.setText(findTestObject('Emoney/Limit Emoney/Input Max Frekuensi harian'), '50')

WebUI.setText(findTestObject('Emoney/Limit Emoney/Input Max Frekuensi Bulanan'), '400')

WebUI.click(findTestObject('Emoney/Limit Emoney/Button Simpan'))

