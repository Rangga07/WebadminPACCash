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

WebUI.enhancedClick(findTestObject('Emoney/Button User Emoney'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Emoney/User Emoney/Input Nama Nasabah'), 'Astrid Alv')

WebUI.setText(findTestObject('Emoney/User Emoney/Input no Rekening'), '0895339895343')

WebUI.setText(findTestObject('Emoney/User Emoney/Input Nomor KTP'), '1234567890789654')

WebUI.selectOptionByValue(findTestObject('Emoney/User Emoney/Dropdown Status'), 'R', false)

WebUI.setText(findTestObject('Emoney/User Emoney/Input Counter Salah login'), '0')

WebUI.setText(findTestObject('Emoney/User Emoney/Input Salah Inquery Question'), '0')

WebUI.click(findTestObject('Emoney/User Emoney/Button cari'))

WebUI.click(findTestObject('Emoney/User Emoney/Button Expord Excel'))

WebUI.click(findTestObject('Emoney/User Emoney/Klik detail Nomor Rekening'))

WebUI.click(findTestObject('Emoney/User Emoney/Button Back Detail'))

