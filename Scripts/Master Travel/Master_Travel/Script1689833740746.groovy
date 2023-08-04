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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.Select as Select
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.util.Random as Random

WebUI.openBrowser('https://dev-mhub.mantis.id/signin')

WebUI.setText(findTestObject('Object Repository/Login/UserName'), 'digitaladmin1')

WebUI.setText(findTestObject('Object Repository/Login/Password'), 'Password@25')

WebUI.click(findTestObject('Object Repository/Login/Button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Pointer_Activity_Dashboard'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Pointer_Umroh'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Pointer_Managemen_Data_Travel'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Pointer_Master_Travel'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Button_Tambah_Travel'))

//input data travel
WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Nama_Travel'), 
    Nama_Travel)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/No_NIB_TDP'), 
    No_NIB_TDP)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/No_SIUP'), 
    No_SIUP)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Alamat'), Alamat)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Provinsi'), 
    Provinsi)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Provinsi'))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Kota_Kabupaten'), 
    KotaKabupaten)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Kota_Kabupaten'))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Kecamatan'), 
    Kecamatan)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Kecamatan', 
        [('index') : Kecamatan]))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Kelurahan'), 
    Kelurahan)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Kelurahan'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Kode_Pos'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Kode_Pos'))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/RT'), Rt)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/RW'), Rw)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Nama_NPWP'), 
    Nama_NPWP)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/No_NPWP'), 
    No_NPWP)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Nama_Penanggung_Jawab'), 
    Nama_PenangungJawab)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Jabatan_Penanggung_Jawab'), 
    Jabatan)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Index_Jabatan_Penanggung_Jawab'))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Email_Travel_Operasional'), 
    Email_Travel_Ops)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Email_Travel_Pembayaran'), 
    Email_Travel_Pembayaran)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Travel/Button_Berikutnya'))

//pilih cabang
WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Cabang/Cari_Nama_Cabang'), 
    Nama_Cabang)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Cabang/Button_Terusuri'))

WebUI.check(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Cabang/Tickmark_Nama_Cabang'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Cabang/Button_Berikutnya'))

//input Daftar Paket
LocalDate today = LocalDate.now()

DateTimeFormatter formatter = DateTimeFormatter.ofPattern('dd/MM/yyyy')

String formattedDate = today.format(formatter)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Nama_Paket'), 
    Nama_Paket)

WebUI.sendKeys(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Tanggal_Mulai'), 
    formattedDate)

WebUI.sendKeys(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Tanggal_Berakhir'), 
    Tanggal_Berakhir)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Button_Tambah_Paket'))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Nama_Paket2'), 
    'paket b')

WebUI.sendKeys(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Tanggal_Mulai2'), 
    formattedDate)

WebUI.sendKeys(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Tanggal_Berakhir2'), 
    Tanggal_Berakhir2)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Paket/Button_Berikutnya'))

//daftar jenis paket
WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Nama_Paket'), 
    Daftar_Nama_Paket)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Index_Nama_Paket'))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Jenis_Paket'), 
    Jenis_Paket)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Harga'), 
    Harga)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Button_Tambah_Jenis_Paket'))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Nama_Paket2'), 
    Daftar_Nama_Paket2)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Index_Nama_Paket'))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Jenis_Paket2'), 
    Jenis_Paket2)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Harga2'), 
    Harga2)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Daftar_Jenis_Paket/Buttton_Berikutnya'))

//data pembayaran
WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Nama_Bank'), 
    Nama_Bank)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Dropdwon_Option', 
        [('index') : Nama_Bank]))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/No_Rekening'), 
    No_Rekening)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Button_Validasi'))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Metode_Pemabayara'), 
    Metode_Pembayaran)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Dropdwon_Option', 
        [('index') : Metode_Pembayaran]))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Jenis_Pajak'), 
    Jenis_Pajak)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Dropdwon_Option', 
        [('index') : Jenis_Pajak]))

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Kewarganegaraan'), 
    Kewarganegaraan)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Dropdwon_Option', 
        [('index') : Kewarganegaraan]))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/CheckBox'))

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Button_Berikutnya'))

//input MOU
WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/No_MOU'), No_MOU)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Nama_Perusahaan'), 
    Nama_Perusahaan)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Nama_Penandatangan_MOU'), 
    Nama_PIC_MOU)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Jabatan_Penandatangan_MOU'), 
    Jabatan_PIC_MOU)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Dropdwon_Option', 
        [('index') : Jabatan_PIC_MOU]))

WebUI.sendKeys(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Tanggal_Berlaku_MOU'), 
    formattedDate)

WebUI.sendKeys(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Tanggal_Berakhir_MOU'), 
    Tanggal_Berakhir_MOU)

WebUI.setText(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Jatuh_Tempo_Bayar'), 
    Jatuh_Tempo_Bayar)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Data_Pemabayaran/Dropdwon_Option', 
        [('index') : Jatuh_Tempo_Bayar]))

String filePath = 'C:\\Users\\User\\Documents\\Dokumen Upload\\'

String fileName = Dokumen_MOU

String Unggahfile = filePath + fileName

WebUI.uploadFile(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Button_Unggah'), 
    Unggahfile)

WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/MOU/Buttton_Berikutnya'))

// Ringkasan
WebUI.click(findTestObject('Object Repository/Navigation_Menu/Activity_Dashboard/Management_Data_Travel/Master_Travel/Ringkasan/Button_Submit'))

