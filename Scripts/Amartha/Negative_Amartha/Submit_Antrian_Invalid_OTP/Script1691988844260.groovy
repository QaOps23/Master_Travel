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
import org.openqa.selenium.By as By
import javax.mail.*
import java.mail.internet.*
import org.openqa.selenium.NoSuchElementException as NoSuchElementException
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.remote.server.handler.FindElement as FindElement
import org.openqa.selenium.WebDriver.Timeouts as Timeouts
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('https://dev-mhub.mantis.id/signin')

WebUI.setText(findTestObject('Object Repository/Login/UserName'), 'digitaladmin1')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Password'), 'p4y+y39Ir5Pc+STqmPi2bw==')

WebUI.click(findTestObject('Object Repository/Login/Button_Login'))

WebUI.maximizeWindow()


WebUI.waitForElementClickable(findTestObject('Object Repository/Navigation_Menu/Finance/NavBar-Finance'), 30)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/NavBar-Finance'))

WebUI.scrollToElement(findTestObject('Object Repository/Navigation_Menu/Finance/NavBar-Channeling'), 10)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/NavBar-Channeling'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/NavBar-Pencairan Channeling'))

// tickmark satu batch id
//WebUI.check(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Pencairan Channeling/Pencairan Dana/CheckBox', [('row') : 1]))

// user klik proses pembayaran
//WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Pencairan Channeling/Pencairan Dana/Tombol_Proses_Pencairan'))

//WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Pencairan Channeling/Pencairan Dana/Tombol_Yakin'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Pencairan Channeling/Antrian Pembayaran/Tab_Antrian'))

// user memproses antrian pembayaran
WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Pencairan Channeling/Antrian Pembayaran/Tombol_Proses_Bayar'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Pencairan Channeling/Antrian Pembayaran/Tombol_Yakin'))

WebUI.sendKeys(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Pencairan Channeling/Antrian Pembayaran/OTP'), '111111')



WebUI.click(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Pencairan Channeling/Antrian Pembayaran/Tombol_Kirim'))

WebUI.getText(findTestObject('Object Repository/Navigation_Menu/Finance/Channeling/Pencairan Channeling/Antrian Pembayaran/Invalid_OTP',[('message'):'Kode OTP yang anda masukkan salah.']))

WebUI.takeScreenshot()

