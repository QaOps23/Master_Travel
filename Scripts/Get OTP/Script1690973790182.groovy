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
import internal.GlobalVariable
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


WebUI.openBrowser('https://dev-mhub.mantis.id/')

CustomKeywords.'opennewtab.OpenNewTab.openNewTab'(DriverFactory.getWebDriver())

WebUI.delay(3)

// Navigate to YopMail
WebUI.navigateToUrl('https://yopmail.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

// Set email and click search
WebUI.setText(findTestObject('Object Repository/YopMail/SetEmail'), "lead.payment")
WebUI.click(findTestObject('Object Repository/YopMail/button_search'))

// Wait for iframe and switch to it
WebUI.waitForElementVisible(findTestObject('Object Repository/YopMail/iframe_inbox'), 10)
WebUI.switchToFrame(findTestObject('Object Repository/YopMail/iframe_inbox'), 30)

// Get OTP from the email
String otp = ""
try {
    String otpString = WebUI.getText(findTestObject('Object Repository/YopMail/Span_OTP'))
    Pattern pattern = Pattern.compile("\\d{6}")
    Matcher matcher = pattern.matcher(otpString)
	matcher.toString()
    if (matcher.find()) {
        otp = matcher.group()
        println("Kode OTP: " + otp)
    } else {
        println("OTP not found in the email.")
    }
} catch (Exception ex) {
    println("Failed to get OTP from the email: " + ex.getMessage())
}

// Switch back to the original tab
WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(0)

WebUI.delay(2)

WebUI.closeBrowser()
