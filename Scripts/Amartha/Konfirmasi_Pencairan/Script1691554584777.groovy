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


WebUI.openBrowser("https://dev-mhub.mantis.id/signin")
WebUI.setText(findTestObject('Object Repository/Login/UserName'), "digitaladmin1")
WebUI.setText(findTestObject('Object Repository/Login/Password'), "Password@25")
WebUI.click(findTestObject('Object Repository/Login/Button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/NavBar-Finance'))

WebUI.scrollToElement(findTestObject('Object Repository/Navigation_Menu/Finance/NavBar-Channeling'), 10)
WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/NavBar-Channeling'))
WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/NavBar-Konfirmasi Pencairan'))

//user proses kofirmasi pencairan

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Konfirmasi Pencairan/Tombol_Proses',[('row'):2]))

String filePath = "C:\\Users\\User\\Documents\\Dokumen Upload\\"
String fileName = "bukti pembayaran BNI.jpeg"
String Unggahfile = filePath + fileName

WebUI.uploadFile(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Konfirmasi Pencairan/Unggah_File'), Unggahfile)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Konfirmasi Pencairan/Tombol_Submit'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Konfirmasi Pencairan/Tombol_Yakin'))


