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

WebUI.click(findTestObject('Object Repository/MELI/span_Atencin Cliente (11)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Recepcion envios Tiendas Comerciante (12)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_EMISIN_frmRecepcionEnvioComerciantetxtEmisionOrderServ (11)'), 
    '24')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO ORDEN_frmRecepcionEnvioComerciant_4fae5b (11)'), '23')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO. REGISTRO_frmRecepcionEnvioComerc_5f022d (12)'), '02400000904')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Se ha recepcionado correctamente el envo (9)'), 'Se ha recepcionado correctamente el envío.')

WebUI.click(findTestObject('Object Repository/MELI/span_Despacho'))

WebUI.click(findTestObject('Object Repository/MELI/span_Por Envo'))

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_codigoBarras'), '02400000904')

WebUI.click(findTestObject('Object Repository/MELI/span_Por Pieza'))

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_codigoBarras (1)'), '02400000904')

WebUI.click(findTestObject('Object Repository/MELI/span_Guia Remitente'))

WebUI.click(findTestObject('Object Repository/MELI/span_Nuevo'))

WebUI.click(findTestObject('Object Repository/MELI/span_Transportista_ui-button-icon-left ui-i_2d54c6'))

WebUI.doubleClick(findTestObject('Object Repository/MELI/td_EMPRESA DE TRANSPORTES EXPRESO INTERNACI_a9020f'))

WebUI.click(findTestObject('Object Repository/MELI/span_Sede Destino_ui-button-icon-left ui-ic_dcc7dd'))

WebUI.click(findTestObject('Object Repository/MELI/th_Nombre SedeFilter by Nombre Sede'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Filter by Nombre Sede_frmSeleccionado_35d1f5'), 'HUACHO')

WebUI.click(findTestObject('Object Repository/MELI/td_HUACHO'))

WebUI.doubleClick(findTestObject('Object Repository/MELI/tbody_HUAHUACHO'))

WebUI.click(findTestObject('Object Repository/MELI/span_Bsqueda inalambrica (F2)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Buscar'))

WebUI.click(findTestObject('Object Repository/MELI/td_5.00'))

WebUI.click(findTestObject('Object Repository/MELI/span_Aceptar todos(F2)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Grabar Guia (Ctrl  Y)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Nmero de emisin_formConfirmarGuiatxtEmision'), '155')

WebUI.click(findTestObject('Object Repository/MELI/td_Nmero de guia_ui-panelgrid-cell'))

WebUI.click(findTestObject('Object Repository/MELI/label_Nmero de guia'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Nmero de guia_formConfirmarGuiatxtNumeroGuia'), '28963')

WebUI.click(findTestObject('Object Repository/MELI/span_Grabar (5)'))

WebUI.rightClick(findTestObject('Object Repository/MELI/span_ERROR'))

WebUI.click(findTestObject('Object Repository/MELI/div_JR MARISCAL CASTILLA NRO 117  HUACHO - _247649'))

WebUI.click(findTestObject('Object Repository/MELI/div_Z7U845_ui-growl-icon-close ui-icon ui-i_0fe082'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Se registro correctamente la guia'), 'Se registro correctamente la guia.')

WebUI.click(findTestObject('Object Repository/MELI/span_Ingresar nmero de guia_ui-icon ui-icon_d6e561'))

WebUI.click(findTestObject('Object Repository/MELI/span_Registro de guia de despacho_ui-icon u_c0d6d1'))

WebUI.click(findTestObject('Object Repository/MELI/span_Distribucion (10)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Asignacion (10)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmAsignaciontxtCodigoOperador (10)'), 'rsf')

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3 (10)'), '02400000904')

WebUI.click(findTestObject('Object Repository/MELI/span_Liquidacin (10)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmLiquidacionEnviotxtCodigoOperador (3)'), 'rsf')

WebUI.click(findTestObject('Object Repository/MELI/li_No quiere recibir (1)'))

WebUI.setText(findTestObject('Object Repository/MELI/textarea_NO VISITADO_frmLiquidacionEnvioglosa (4)'), 'pruebas meli')

WebUI.setText(findTestObject('Object Repository/MELI/input_COD. DE BARRAS_frmLiquidacionEnviocod_18abd7 (6)'), '02400000904')

WebUI.click(findTestObject('Object Repository/MELI/span_Consulta Envio_ui-button-icon-left ui-_851a57 (7)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Lectora_frmConsultaEnviotxtEmisionRemito (6)'), '02400000904')

WebUI.click(findTestObject('Object Repository/MELI/a_Ruta envo (6)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_RECEPCION TIENDA (6)'), 'RECEPCION TIENDA')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_PRE DESPACHO'), 'PRE DESPACHO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_DESPACHADO'), 'DESPACHADO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_ASIGNADO (6)'), 'ASIGNADO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_MOTIVADO (3)'), 'MOTIVADO')

