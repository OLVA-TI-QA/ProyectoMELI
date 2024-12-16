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

WebUI.click(findTestObject('Object Repository/MELI/span_Atencin Cliente (13)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Recepcion envios Tiendas Comerciante (17)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_EMISIN_frmRecepcionEnvioComerciantetxtEmisionOrderServ (16)'), 
    '24')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO ORDEN_frmRecepcionEnvioComerciant_4fae5b (16)'), '25')

WebUI.setText(findTestObject('Object Repository/MELI/input_NRO. REGISTRO_frmRecepcionEnvioComerc_5f022d (17)'), '02400000902')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Se ha recepcionado correctamente el envo (14)'), 'Se ha recepcionado correctamente el envío.')

WebUI.click(findTestObject('Object Repository/MELI/span_Distribucion (15)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Asignacion (14)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmAsignaciontxtCodigoOperador (14)'), 'rsf')

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3 (14)'), '02400000902')

WebUI.click(findTestObject('Object Repository/MELI/span_Liquidacin (13)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmLiquidacionEnviotxtCodigoOperador (4)'), 'rsf')

WebUI.click(findTestObject('Object Repository/MELI/li_Ausente'))

WebUI.setText(findTestObject('Object Repository/MELI/textarea_NO VISITADO_frmLiquidacionEnvioglosa (5)'), 'pruebas MELI')

WebUI.setText(findTestObject('Object Repository/MELI/input_COD. DE BARRAS_frmLiquidacionEnviocod_18abd7 (8)'), '02400000902')

WebUI.click(findTestObject('Object Repository/MELI/span_Siniestrar Envo (5)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_PISTOLEAR TRACKING_frmSiniestrarcodigoBarras (5)'), '02400000902')

WebUI.click(findTestObject('Object Repository/MELI/label_Seleccionar (2)'))

WebUI.click(findTestObject('Object Repository/MELI/li_DAADO'))

WebUI.click(findTestObject('Object Repository/MELI/span_GRABAR (9)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Grabado Exitoso (5)'), 'Grabado Exitoso.')

