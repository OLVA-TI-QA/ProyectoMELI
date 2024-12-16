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

WebUI.callTestCase(findTestCase('8-MELI/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MELI/span_Atencin Cliente'))

WebUI.click(findTestObject('Object Repository/MELI/span_Recepcion envios Tiendas Comerciante'))

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO ORDEN_frmRecepcionEnvioComerciantetxtNumeroOrdenServ'), '123456')

WebUI.sendKeys(findTestObject('Object Repository/MELI/input_NRO ORDEN_frmRecepcionEnvioComerciantetxtNumeroOrdenServ'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/p_Debe ingresar el Orden de Servicio'), 'Debe ingresar el Orden de Servicio.')

WebUI.setText(findTestObject('Object Repository/MELI/input_EMISIN_frmRecepcionEnvioComerciantetx_2addf1'), '54')

WebUI.sendKeys(findTestObject('Object Repository/MELI/input_EMISIN_frmRecepcionEnvioComerciantetx_2addf1'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_El Orden de Servicio ingresado no se e_3d23bf'), 'El Orden de Servicio ingresado no se encuentra registrado o no pertenece a la Sede.')

WebUI.setText(findTestObject('Object Repository/MELI/input_EMISIN_frmRecepcionEnvioComerciantetx_2addf1'), '24')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO ORDEN_frmRecepcionEnvioComerciantetxtNumeroOrdenServ'), '12')

WebUI.sendKeys(findTestObject('Object Repository/MELI/input_NRO ORDEN_frmRecepcionEnvioComerciantetxtNumeroOrdenServ'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_No se encontr Orden de Servicio de Mer_cefbb9'), 'No se encontró Orden de Servicio de Mercado Libre')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO. REGISTRO_frmRecepcionEnvioComerc_5f022d'), '02400000892')

WebUI.sendKeys(findTestObject('Object Repository/MELI/input_NRO. REGISTRO_frmRecepcionEnvioComerc_5f022d'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Por favor, debe ingresar la emisin y n_a2187e'), 'Por favor, debe ingresar la emisión y número de la Orden de Servicio')

