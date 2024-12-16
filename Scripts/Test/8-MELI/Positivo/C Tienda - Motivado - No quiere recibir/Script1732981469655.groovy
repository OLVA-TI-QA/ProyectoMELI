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

WebUI.click(findTestObject('Object Repository/MELI/span_Maestros (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Host (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Configurar (1)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Host_frmConfHosthostComplete_input (1)'), 'comas')

WebUI.click(findTestObject('Object Repository/MELI/li_COMASPC'))

WebUI.click(findTestObject('Object Repository/MELI/span_Grabar (3)'))

WebUI.click(findTestObject('Object Repository/MELI/a_Jennifer Rios Alejos (1)'))

WebUI.click(findTestObject('Object Repository/MELI/a_Cerrar sesin (1)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Acceder para continuar a Olva_frmLogi_1df1ac (11)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/MELI/input_Acceder para continuar a Olva_frmLogi_dbfc6f (11)'), 
    'uXKCPWz3P6s=')

WebUI.click(findTestObject('Object Repository/MELI/input_Acceder para continuar a Olva_frmLogi_81423f (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Atencin Cliente (9)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Recepcion envios Tiendas Comerciante (10)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_EMISIN_frmRecepcionEnvioComerciantetxtEmisionOrderServ (9)'), 
    '24')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO ORDEN_frmRecepcionEnvioComerciant_4fae5b (9)'), '23')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO. REGISTRO_frmRecepcionEnvioComerc_5f022d (10)'), '02400000364')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Se ha recepcionado correctamente el envo (7)'), 'Se ha recepcionado correctamente el envío.')

WebUI.click(findTestObject('Object Repository/MELI/span_Distribucion (8)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Asignacion (8)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmAsignaciontxtCodigoOperador (8)'), 'com')

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3 (8)'), '02400000364')

WebUI.click(findTestObject('Object Repository/MELI/span_Atencin Cliente (9)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Recepcion Envios Tiendas'))

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_txtCodigoBarras'), '02400000364')

WebUI.click(findTestObject('Object Repository/MELI/span_Distribucion (8)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Liquidacin (8)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmLiquidacionEnviotxtCodigoOperador (2)'), 'com')

WebUI.click(findTestObject('Object Repository/MELI/li_No quiere recibir'))

WebUI.setText(findTestObject('Object Repository/MELI/textarea_NO VISITADO_frmLiquidacionEnvioglosa (3)'), 'pruebas meli')

WebUI.setText(findTestObject('Object Repository/MELI/input_COD. DE BARRAS_frmLiquidacionEnviocod_18abd7 (4)'), '02400000364')

WebUI.click(findTestObject('Object Repository/MELI/span_Consulta Envio_ui-button-icon-left ui-_851a57 (5)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Lectora_frmConsultaEnviotxtEmisionRemito (4)'), '02400000364')

WebUI.click(findTestObject('Object Repository/MELI/a_Ruta envo (4)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_RECEPCION TIENDA (4)'), 'RECEPCION TIENDA')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_ASIGNADO (4)'), 'ASIGNADO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_CONFIRMACION EN TIENDA'), 'CONFIRMACION EN TIENDA')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_MOTIVADO (2)'), 'MOTIVADO')

