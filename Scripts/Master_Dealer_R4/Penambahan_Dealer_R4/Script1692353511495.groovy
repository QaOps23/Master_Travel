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

WebUI.openBrowser("https://dev-mhub.mantis.id/signin")
WebUI.setText(findTestObject('Object Repository/Login/UserName'), "digitaladmin1")
WebUI.setText(findTestObject('Object Repository/Login/Password'), "Password@25")
WebUI.click(findTestObject('Object Repository/Login/Button_Login'))

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Object Repository/Master_Dealer_R4/Navbar/Managemen_Operasi'), 30)

WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Navbar/Managemen_Operasi'))
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Navbar/Cabang'))
WebUI.scrollToElement(findTestObject('Object Repository/Master_Dealer_R4/Navbar/Manaajemen_Data_Dealer_R4'), 0)
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Navbar/Manaajemen_Data_Dealer_R4'))
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Navbar/Master_Dealer_R4'))

WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Tombol_Tambah_Dealer_R4'))

// user input data dealer 

int stringLength = 4
String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
Random random = new Random()
StringBuilder randomString = new StringBuilder(stringLength)
for (int i = 0; i < stringLength; i++) {
	randomString.append(characters.charAt(random.nextInt(characters.length())))
}

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Nama_Dealer_R4'), "Dealer" + " " +randomString.toString())
WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/No_NIB_TDP'), "9866789898679879")
WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/No_SIUP'), "764569879897988")

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Alamat'), "Jalan Sentosa")

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Provinsi'), "SUMATERA BARAT")
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Index_Provinsi'))

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Kota_Kabupaten'), "SOLOK SELATAN")
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Index_Kota_Kabupaten'))

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Kecamatan'), "SANGIR")
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Index_Kecamatan', [('index'): 'SANGIR']))

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Kelurahan'), "PALABIHAN")
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Index_Kelurahan'))

WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Kode_Pos'))
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Index_Kode_Pos'))

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/RT'), "001")
WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/RW'), "001")

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Nama_NPWP'), "Jaka")
WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/No_NPWP'), "874567897765878")

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Nama_Penanggung_Jawab'), "Jaka")

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Jabatan_Penanggung_Jawab'), "DIREKTUR")
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Index_Jabatan_Penanggung_Jawab'))

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Email_DealerR4_Operasional'), "Jaka@yopmail.com")
WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Email_DealerR4_Pembayaran'), "Jaka@yopmail.com")

WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Dealer_R4/Button_Berikutnya'))

// User Input Data Cabang

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Cabang/Cari_Nama_Cabang'), "BOGOR")
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Cabang/Button_Terusuri'))
WebUI.check(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Cabang/Tickmark_Nama_Cabang'))
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Cabang/Button_Berikutnya'))

// User Input Data Pembayaran

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/Nama_Bank'), "BANK CIMB NIAGA")
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/Dropdwon_Option', [('index'): 'BANK CIMB NIAGA']))

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/No_Rekening'), "12129809798989")
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/Button_Validasi'))

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/Metode_Pembayaran'), "TRANSFER")
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/Dropdwon_Option', [('index'): 'TRANSFER']))

WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/Kewarganegaraan'), "WNI")
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/Dropdwon_Option', [('index'): 'WNI']))

WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/CheckBox_Subsidi'))

WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/CheckBox_ADM'))

WebUI.scrollToElement(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/Jenis_Pajak'), 30)
WebUI.setText(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/Jenis_Pajak'), "PERUSAHAAN")
WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/Dropdwon_Option', [('index'): 'PERUSAHAAN']))


WebUI.click(findTestObject('Object Repository/Master_Dealer_R4/Penambahan_Dealer_R4/Data_Pembayaran/Button_Berikutnya'))

// MOU
LocalDate today = LocalDate.now()

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

String formattedDate = today.format(formatter)

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/No_MOU'), "9879867799868698")
WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Nama_Perusahaan'), "Dealer"  + " " +randomString.toString())
WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Nama_Penandatangan_MOU'), "ABC")

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Jabatan_Penandatangan_MOU'), "DIREKTUR")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Dropdwon_Option', [('index'): 'DIREKTUR']))

WebUI.sendKeys(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Tanggal_Berlaku_MOU'), formattedDate)

WebUI.sendKeys(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Tanggal_Berakhir_MOU'), "14 September 2023")

WebUI.setText(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Jatuh_Tempo_Bayar'), "1 HARI")
WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Dropdwon_Option', [('index'): '1 HARI']))


String filePath = "C:\\Users\\User\\Documents\\Dokumen Upload\\"
String fileName = "MOU1.pdf"
String Unggahfile = filePath + fileName

WebUI.uploadFile(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Button_Unggah'), Unggahfile)

WebUI.click(findTestObject('Object Repository/Master_Travel/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Buttton_Berikutnya'))
