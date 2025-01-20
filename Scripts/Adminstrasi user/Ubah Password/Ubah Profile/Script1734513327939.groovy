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

WebUI.click(findTestObject('Menu Utama/Button Administrasi User'))

WebUI.click(findTestObject('Admistrasi User/Pemeliharaan user/Button Pemeliharaan User'))

WebUI.click(findTestObject('Admistrasi User/Ubah Password/a_Ubah Password'))

WebUI.click(findTestObject('Admistrasi User/Ubah Password/Button Ubah Profile'))

WebUI.setText(findTestObject('Admistrasi User/Ubah Password/Input Alamat Email'), email)

WebUI.setText(findTestObject('Admistrasi User/Ubah Password/Input No telepon'), noTelepon)

WebUI.setText(findTestObject('Admistrasi User/Ubah Password/Input Password Saat Ini'), GlobalVariable.password_Login)

'Setiap Di Jalankan Harus di ganti Password baru'
WebUI.setText(findTestObject('Admistrasi User/Ubah Password/Input password Baru'), passwordBaru)

WebUI.setText(findTestObject('Admistrasi User/Ubah Password/Input Konfirmasi Password baru'), passwordBaru)

WebUI.click(findTestObject('Admistrasi User/Ubah Password/Button Ubah'))

