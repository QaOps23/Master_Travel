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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import javax.mail.*
import java.mail.internet.*
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.server.handler.FindElement
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver.Timeouts
import java.util.regex.Matcher
import java.util.regex.Pattern


WebUI.openBrowser('https://yopmail.com')
WebUI.setText(findTestObject('Object Repository/YopMail/SetEmail'), "lead.payment")
WebUI.click(findTestObject('Object Repository/YopMail/button_search'))

WebUI.switchToFrame(findTestObject('Object Repository/YopMail/iframe_inbox'), 0)

String otpString = WebUI.getText(findTestObject('Object Repository/YopMail/Span_OTP'))
Pattern pattern = Pattern.compile("\\d{6}")
Matcher matcher = pattern.matcher(otpString)
String otp = ""
if (matcher.find()) {
	otp = matcher.group()
}

println(otp)

