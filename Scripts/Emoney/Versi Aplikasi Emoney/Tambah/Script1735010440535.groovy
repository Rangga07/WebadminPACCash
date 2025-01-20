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

WebUI.enhancedClick(findTestObject('Emoney/Button Versi Aplikasi Emoney'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Emoney/Versi Aplikasi Emoney/Dropdown Platform'), '12', false)

WebUI.click(findTestObject('Emoney/Versi Aplikasi Emoney/Button Cari'))

WebUI.deselectOptionByValue(findTestObject('Emoney/Versi Aplikasi Emoney/Tambah/Dropdown Platform'), '12', false)

WebUI.setText(findTestObject('Emoney/Versi Aplikasi Emoney/Tambah/Input Version ID'), '30')

WebUI.setText(findTestObject('Emoney/Versi Aplikasi Emoney/Tambah/Input Version'), '1.60.1')

WebUI.setText(findTestObject('Emoney/Versi Aplikasi Emoney/Tambah/Input Perubahan'), 'Term and Condition')

WebUI.click(findTestObject('Emoney/Versi Aplikasi Emoney/Tambah/Button Tambah'))

