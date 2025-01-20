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

WebUI.click(findTestObject('Menu Utama/Button Inquiry'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Inquery/Button Aktivitas Nasabah'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Inquery/Aktifitas Nasabah/Input Periode Awal'), '29-12-2023', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Inquery/Aktifitas Nasabah/Input Periode Akhir'), '19-12-2024', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Inquery/Aktifitas Nasabah/Input No rekening'), '087750106929', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Inquery/Aktifitas Nasabah/Input No Referensi'), '65FB6E045BA4', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Inquery/Aktifitas Nasabah/Button Cari'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Inquery/Button Export Excel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

