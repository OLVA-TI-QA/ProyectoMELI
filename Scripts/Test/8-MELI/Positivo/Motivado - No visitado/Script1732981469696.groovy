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

WebUI.click(findTestObject('Page_Principal - Olva Courier/span_Atencin Cliente (8)'))

WebUI.click(findTestObject('Page_Principal - Olva Courier/span_Recepcion envios Tiendas Comerciante (9)'))

WebUI.setText(findTestObject('Page_Principal - Olva Courier/input_EMISIN_frmRecepcionEnvioComerciantetxtEmisionOrderServ (8)'), 
    '24')

WebUI.setText(findTestObject('Page_Principal - Olva Courier/input_NRO ORDEN_frmRecepcionEnvioComerciant_4fae5b (8)'), '23')

WebUI.setText(findTestObject('Page_Principal - Olva Courier/input_NRO. REGISTRO_frmRecepcionEnvioComerc_5f022d (9)'), '02400000897')

WebUI.verifyElementText(findTestObject('Page_Principal - Olva Courier/span_Se ha recepcionado correctamente el envo (6)'), 
    'Se ha recepcionado correctamente el envío.')

WebUI.click(findTestObject('Page_Principal - Olva Courier/span_Distribucion (7)'))

WebUI.click(findTestObject('Page_Principal - Olva Courier/span_Asignacion (7)'))

WebUI.setText(findTestObject('Page_Principal - Olva Courier/input_OPERADOR_frmAsignaciontxtCodigoOperador (7)'), 'rsf')

WebUI.setText(findTestObject('Page_Principal - Olva Courier/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3 (7)'), '02400000897')

WebUI.click(findTestObject('Page_Principal - Olva Courier/span_Liquidacin (7)'))

WebUI.click(findTestObject('Page_Principal - Olva Courier/div_Direccin IncorrectaSe mudLocal vacoAuse_58fd57'))

WebUI.click(findTestObject('Page_Principal - Olva Courier/li_NO VISITADO'))

WebUI.setText(findTestObject('Page_Principal - Olva Courier/textarea_NO VISITADO_frmLiquidacionEnvioglosa (2)'), 'pruebas Meli')

WebUI.setText(findTestObject('Page_Principal - Olva Courier/input_OPERADOR_frmLiquidacionEnviotxtCodigo_dc5f93 (1)'), 'rsf')

WebUI.setText(findTestObject('Page_Principal - Olva Courier/input_COD. DE BARRAS_frmLiquidacionEnviocod_18abd7 (3)'), '02400000897')

WebUI.click(findTestObject('Object Repository/MELI/span_Consulta Envio_ui-button-icon-left ui-_851a57 (4)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Lectora_frmConsultaEnviotxtEmisionRemito (3)'), '02400000897')

WebUI.click(findTestObject('Object Repository/MELI/a_Asignaciones envo (1)'))

WebUI.click(findTestObject('Object Repository/MELI/a_Asignaciones envo (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_NO VISITADO'), 'NO VISITADO')

WebUI.click(findTestObject('Object Repository/MELI/a_Ruta envo (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_RECEPCION TIENDA (3)'), 'RECEPCION TIENDA')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_ASIGNADO (3)'), 'ASIGNADO')

