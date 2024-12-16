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

WebUI.click(findTestObject('Object Repository/MELI/span_Atencin Cliente (12)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Recepcion envios Tiendas Comerciante (15)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_EMISIN_frmRecepcionEnvioComerciantetxtEmisionOrderServ (14)'), 
    '24')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO ORDEN_frmRecepcionEnvioComerciant_4fae5b (14)'), '25')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO. REGISTRO_frmRecepcionEnvioComerc_5f022d (15)'), '02400000899')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Se ha recepcionado correctamente el envo (12)'), 'Se ha recepcionado correctamente el envío.')

WebUI.click(findTestObject('Object Repository/MELI/span_Distribucion (13)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Siniestrar Envo (3)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_PISTOLEAR TRACKING_frmSiniestrarcodigoBarras (3)'), '02400000899')

WebUI.click(findTestObject('Object Repository/MELI/span_Seleccionar_ui-icon ui-icon-triangle-1-s ui-c (1)'))

WebUI.click(findTestObject('Object Repository/MELI/li_EXTRAVO'))

WebUI.click(findTestObject('Object Repository/MELI/span_GRABAR (7)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Grabado Exitoso (3)'), 'Grabado Exitoso.')

