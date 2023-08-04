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

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Pointer_Activity_Dashboard'))
WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Pointer_Umroh'))
WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Pointer_Managemen_Data_Travel'))
WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Persetujuan_Master_Travel/Pointer_Persetujuan_Master_Travel'))

// proses persetujuan master travel

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Persetujuan_Master_Travel/Button_Proses',[('row'):2]))
WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Persetujuan_Master_Travel/TickMark_MOU'))
WebUI.switchToWindowIndex(0)
WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Persetujuan_Master_Travel/Button_Setuju'))