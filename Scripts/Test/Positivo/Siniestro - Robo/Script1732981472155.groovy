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

WebUI.click(findTestObject('Object Repository/MELI/a_Atencin Cliente (3)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Recepcion envios Tiendas Comerciante (16)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_EMISIN_frmRecepcionEnvioComerciantetxtEmisionOrderServ (15)'), 
    '24')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO ORDEN_frmRecepcionEnvioComerciant_4fae5b (15)'), '25')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO. REGISTRO_frmRecepcionEnvioComerc_5f022d (16)'), '02400000900')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Se ha recepcionado correctamente el envo (13)'), 'Se ha recepcionado correctamente el envío.')

WebUI.click(findTestObject('Object Repository/MELI/span_Distribucion (14)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Asignacion (13)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmAsignaciontxtCodigoOperador (13)'), 'rsf')

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3 (13)'), '02400000900')

WebUI.click(findTestObject('Object Repository/MELI/span_Siniestrar Envo (4)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_PISTOLEAR TRACKING_frmSiniestrarcodigoBarras (4)'), '02400000900')

WebUI.click(findTestObject('Object Repository/MELI/label_Seleccionar (1)'))

WebUI.click(findTestObject('Object Repository/MELI/li_CASOS ESER (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_GRABAR (8)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Seleccione un motivo correcto para env_a01cd0 (1)'), 
    'Seleccione un motivo correcto para envíos MercadoLibre')

WebUI.click(findTestObject('Object Repository/MELI/span_CASOS ESER_ui-icon ui-icon-triangle-1-s ui-c (1)'))

WebUI.click(findTestObject('Object Repository/MELI/li_ROBO'))

WebUI.click(findTestObject('Object Repository/MELI/span_GRABAR (8)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Grabado Exitoso (4)'), 'Grabado Exitoso.')

WebUI.click(findTestObject('Object Repository/MELI/span_Consulta Envio'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Lectora_frmConsultaEnviotxtEmisionRemito (8)'), '02400000900')

WebUI.click(findTestObject('Object Repository/MELI/a_Ruta envo (8)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_RECEPCION TIENDA (8)'), 'RECEPCION TIENDA')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_ASIGNADO (8)'), 'ASIGNADO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_SINIESTRADO (1)'), 'SINIESTRADO')

