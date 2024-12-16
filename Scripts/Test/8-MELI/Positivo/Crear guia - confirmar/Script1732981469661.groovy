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

WebUI.click(findTestObject('Object Repository/MELI/a_Atencin Cliente (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Recepcion envios Tiendas Comerciante (13)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_EMISIN_frmRecepcionEnvioComerciantetxtEmisionOrderServ (12)'), 
    '24')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO ORDEN_frmRecepcionEnvioComerciant_4fae5b (12)'), '25')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO. REGISTRO_frmRecepcionEnvioComerc_5f022d (13)'), '02400000903')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Se ha recepcionado correctamente el envo (10)'), 'Se ha recepcionado correctamente el envío.')

WebUI.click(findTestObject('Object Repository/MELI/span_Despacho (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Por Pieza (1)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_codigoBarras (2)'), '02400000903')

WebUI.click(findTestObject('Object Repository/MELI/span_Guia Remitente (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Nuevo (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Transportista_ui-button-icon-left ui-i_2d54c6 (1)'))

WebUI.doubleClick(findTestObject('Object Repository/MELI/td_EOS (1)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Sede Destino_frmGuiaRemisiontxtSedeInp'), 'hua')

WebUI.click(findTestObject('Object Repository/MELI/span_Bsqueda inalambrica (F2) (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Buscar (1)'))

WebUI.click(findTestObject('Object Repository/MELI/td_1'))

WebUI.click(findTestObject('Object Repository/MELI/span_Aceptar todos(F2) (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Grabar Guia (Ctrl  Y) (1)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Nmero de emisin_formConfirmarGuiatxtEmision (1)'), '155')

WebUI.setText(findTestObject('Object Repository/MELI/input_Nmero de guia_formConfirmarGuiatxtNumeroGuia (1)'), '0')

WebUI.click(findTestObject('Object Repository/MELI/td_Nmero de guia'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Nmero de guia_formConfirmarGuiatxtNumeroGuia (1)'), '5269852')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Se registro correctamente la guia (1)'), 'Se registro correctamente la guia.')

WebUI.click(findTestObject('Object Repository/MELI/span_Ingresar nmero de guia_ui-icon ui-icon_d6e561 (1)'))

WebUI.click(findTestObject('Object Repository/MELI/div_Z7U845_ui-growl-icon-close ui-icon ui-i_0fe082 (1)'))

WebUI.click(findTestObject('Object Repository/MELI/div_No_ui-growl-icon-close ui-icon ui-icon-_9d4a45'))

WebUI.click(findTestObject('Object Repository/MELI/span_Registro de guia de despacho_ui-icon u_c0d6d1 (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Distribucion (11)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Asignacion (11)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmAsignaciontxtCodigoOperador (11)'), 'rsf')

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3 (11)'), '02400000903')

WebUI.click(findTestObject('Object Repository/MELI/span_Liquidacin (11)'))

WebUI.click(findTestObject('Object Repository/MELI/span_MOTIVACIN_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmLiquidacionEnviotxtCodigo_dc5f93 (3)'), 'rsf')

WebUI.setText(findTestObject('Object Repository/MELI/input_COD. DE BARRAS_frmLiquidacionEnviocod_18abd7 (7)'), '02400000903')

WebUI.click(findTestObject('Object Repository/MELI/span_Consulta Envio_ui-button-icon-left ui-_851a57 (8)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Lectora_frmConsultaEnviotxtEmisionRemito (7)'), '02400000903')

WebUI.click(findTestObject('Object Repository/MELI/a_Ruta envo (7)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_RECEPCION TIENDA (7)'), 'RECEPCION TIENDA')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_PRE DESPACHO (1)'), 'PRE DESPACHO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_DESPACHADO (1)'), 'DESPACHADO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_ASIGNADO (7)'), 'ASIGNADO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_ENTREGADO (2)'), 'ENTREGADO')

