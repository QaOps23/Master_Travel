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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import org.openqa.selenium.JavascriptExecutor

WebUI.openBrowser("https://dev-mhub.mantis.id/signin")
WebUI.setText(findTestObject('Object Repository/Login/UserName'), "digitaladmin1")
WebUI.setText(findTestObject('Object Repository/Login/Password'), "Password@25")
WebUI.click(findTestObject('Object Repository/Login/Button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Pointer_Activity_Dashboard'))
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Pointer_Umroh'))
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Pointer_Managemen_Data_Travel'))
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Pointer_Master_Travel'))
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Button_Tambah_Travel'))


//input data travel

int stringLength = 4
String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
Random random = new Random()
StringBuilder randomString = new StringBuilder(stringLength)
for (int i = 0; i < stringLength; i++) {
	randomString.append(characters.charAt(random.nextInt(characters.length())))
}


WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Nama_Travel'), "Travel" + " " +randomString.toString())
WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/No_NIB_TDP'), "9866789898679879")
WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/No_SIUP'), "764569879897988")

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Alamat'), "Jalan Sentosa")

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Provinsi'), "SUMATERA BARAT")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Provinsi'))

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Kota_Kabupaten'), "SOLOK SELATAN")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Kota_Kabupaten'))

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Kecamatan'), "SANGIR")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Kecamatan', [('index'): 'SANGIR']))

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Kelurahan'), "PALABIHAN")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Kelurahan'))

WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Kode_Pos'))
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Kode_Pos'))

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/RT'), "001")
WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/RW'), "001")

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Nama_NPWP'), "Jaka")
WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/No_NPWP'), "874567897765878")

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Nama_Penanggung_Jawab'), "Jaka")

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Jabatan_Penanggung_Jawab'), "DIREKTUR")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Jabatan_Penanggung_Jawab'))

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Email_Travel_Operasional'), "jaka@yopmail.com")

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Email_Travel_Pembayaran'), "jaka@yopmail.com")

WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Button_Berikutnya'))

//pilih cabang

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Cabang/Cari_Nama_Cabang'), "Bogor")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Cabang/Button_Terusuri'))
WebUI.check(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Cabang/Tickmark_Nama_Cabang'))
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Cabang/Button_Berikutnya'))

//input Daftar Paket

LocalDate today = LocalDate.now()

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

String formattedDate = today.format(formatter)

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Nama_Paket'), "Paket a")

WebUI.sendKeys(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Tanggal_Mulai'), formattedDate)

WebUI.sendKeys(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Tanggal_Berakhir'), "22-Oct-2023")

WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Button_Tambah_Paket'))

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Nama_Paket2'), "paket b")

WebUI.sendKeys(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Tanggal_Mulai2'), formattedDate)

WebUI.sendKeys(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Tanggal_Berakhir2'), "22-Oct-2023")

WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Button_Berikutnya'))

//daftar jenis paket

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Nama_Paket'), "PAKET A")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Index_Nama_Paket'))

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Jenis_Paket'), "GOLD")

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Harga'), "20000000")

WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Button_Tambah_Jenis_Paket'))

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Nama_Paket2'), "PAKET B")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Index_Nama_Paket'))

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Jenis_Paket2'), "GOLD")

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Harga2'), "20000000")

WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Buttton_Berikutnya'))

//data pembayaran

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Nama_Bank'), "BANK CIMB NIAGA")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Dropdwon_Option', [('index'): 'BANK CIMB NIAGA']))

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/No_Rekening'), " ")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Button_Validasi'))


WebElement element = WebUI.verifyTextPresent("Nomor rekening tidak valid", false)
String script = 'arguments[0].style.backgroundColor = "yellow"'
((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript(script, element)


WebUI.takeScreenshot()

