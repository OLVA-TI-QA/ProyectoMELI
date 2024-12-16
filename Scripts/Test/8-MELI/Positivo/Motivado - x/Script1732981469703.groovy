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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-olva-corp.olvacourier.com/OlvaERP-web/login.xhtml')

WebUI.setText(findTestObject('Object Repository/MELI/input_Acceder para continuar a Olva_frmLogi_1df1ac (4)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/MELI/input_Acceder para continuar a Olva_frmLogi_dbfc6f (4)'), 
    'uXKCPWz3P6s=')

WebUI.click(findTestObject('Object Repository/MELI/span_Maestros'))

WebUI.click(findTestObject('Object Repository/MELI/span_Host'))

WebUI.click(findTestObject('Object Repository/MELI/span_Configurar'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Host_frmConfHosthostComplete_input'), 'comaspc')

WebUI.click(findTestObject('Object Repository/MELI/span_COMASPC'))

WebUI.click(findTestObject('Object Repository/MELI/span_Grabar (2)'))

WebUI.click(findTestObject('Object Repository/MELI/a_Jennifer Rios Alejos'))

WebUI.click(findTestObject('Object Repository/MELI/a_Cerrar sesin'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Acceder para continuar a Olva_frmLogi_1df1ac (4)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/MELI/input_Acceder para continuar a Olva_frmLogi_dbfc6f (4)'), 
    'uXKCPWz3P6s=')

WebUI.click(findTestObject('Object Repository/MELI/span_Atencin Cliente (3)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Recepcion envios Tiendas Comerciante (3)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_EMISIN_frmRecepcionEnvioComerciantetxtEmisionOrderServ (2)'), 
    '24')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO ORDEN_frmRecepcionEnvioComerciant_4fae5b (2)'), '23')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO. REGISTRO_frmRecepcionEnvioComerc_5f022d (3)'), '02400000895')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Se ha recepcionado correctamente el envo (1)'), 'Se ha recepcionado correctamente el envío.')

WebUI.click(findTestObject('Object Repository/MELI/a_Distribucion (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Asignacion (1)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmAsignaciontxtCodigoOperador (1)'), 'rsf')

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3 (1)'), '02400000895')

WebUI.click(findTestObject('Object Repository/MELI/span_Liquidacin (1)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmLiquidacionEnviotxtCodigoOperador (1)'), 'rsf')

WebUI.click(findTestObject('Object Repository/MELI/li_Faltan datos'))

WebUI.setText(findTestObject('Object Repository/MELI/textarea_NO VISITADO_frmLiquidacionEnvioglosa (1)'), 'preubas Meli')

WebUI.setText(findTestObject('Object Repository/MELI/input_COD. DE BARRAS_frmLiquidacionEnviocod_18abd7 (1)'), '02400000895')

WebUI.click(findTestObject('Object Repository/MELI/span_Consulta Envio_ui-button-icon-left ui-_851a57 (2)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Lectora_frmConsultaEnviotxtEmisionRemito (1)'), '02400000895')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/input_Oficina_frmConsultaEnviopanelEnviooficina'), '')

WebUI.click(findTestObject('Object Repository/MELI/a_Ruta envo (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_RECEPCION TIENDA (1)'), 'RECEPCION TIENDA')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_ASIGNADO (1)'), 'ASIGNADO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_MOTIVADO (1)'), 'MOTIVADO')

