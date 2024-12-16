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

WebUI.click(findTestObject('Object Repository/MELI/span_Distribucion (16)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Asignacion (15)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmAsignaciontxtCodigoOperador (15)'), 'rsf')

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3 (15)'), '02400000339')

WebUI.doubleClick(findTestObject('Object Repository/MELI/input_OPERADOR_frmAsignaciontxtCodigoOperador (15)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmAsignaciontxtCodigoOperador (15)'), 'com')

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3 (15)'), '02400000339')

WebUI.click(findTestObject('Object Repository/MELI/span_Maestros (3)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Host (3)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Configurar (3)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Host_frmConfHosthostComplete_input (3)'), 'comas')

WebUI.click(findTestObject('Object Repository/MELI/span_COMAS'))

WebUI.click(findTestObject('Object Repository/MELI/span_Host_ui-button-icon-left ui-icon ui-c _116f86'))

WebUI.click(findTestObject('Object Repository/MELI/a_Jennifer Rios Alejos (3)'))

WebUI.click(findTestObject('Object Repository/MELI/a_Cerrar sesin (3)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Acceder para continuar a Olva_frmLogi_1df1ac (19)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/MELI/input_Acceder para continuar a Olva_frmLogi_dbfc6f (19)'), 
    'uXKCPWz3P6s=')

WebUI.click(findTestObject('Object Repository/MELI/input_Acceder para continuar a Olva_frmLogi_81423f (3)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Atencin Cliente (14)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Recepcion Envios Tiendas (2)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_txtCodigoBarras (2)'), '02400000339')

WebUI.click(findTestObject('Object Repository/MELI/span_Distribucion (16)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Asignacion (15)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmAsignaciontxtCodigoOperador (15)'), 'rsf')

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3 (15)'), '02400000339')

WebUI.click(findTestObject('Object Repository/MELI/span_Liquidacin (14)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmLiquidacionEnviotxtCodigoOperador (5)'), 'rsf')

WebUI.click(findTestObject('Object Repository/MELI/li_Local vaco'))

WebUI.setText(findTestObject('Object Repository/MELI/textarea_NO VISITADO_frmLiquidacionEnvioglosa (6)'), 'preubas')

WebUI.setText(findTestObject('Object Repository/MELI/input_COD. DE BARRAS_frmLiquidacionEnviocod_18abd7 (9)'), '02400000339')

WebUI.click(findTestObject('Object Repository/MELI/span_Asignacion (15)'))

WebUI.click(findTestObject('Object Repository/MELI/div_SALIDA_ui-selectonemenu-trigger ui-stat_95a8ea'))

WebUI.click(findTestObject('Object Repository/MELI/li_2'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmAsignaciontxtCodigoOperador (15)'), 'rsf')

WebUI.setText(findTestObject('Object Repository/MELI/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3 (15)'), '02400000339')

WebUI.click(findTestObject('Object Repository/MELI/span_Liquidacin (14)'))

WebUI.click(findTestObject('Object Repository/MELI/label_ENTREGA (1)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_OPERADOR_frmLiquidacionEnviotxtCodigoOperador (5)'), 'rsf')

WebUI.setText(findTestObject('Object Repository/MELI/input_COD. DE BARRAS_frmLiquidacionEnviocod_18abd7 (9)'), '02400000339')

WebUI.click(findTestObject('Object Repository/MELI/span_Consulta Envio_ui-button-icon-left ui-_851a57 (10)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_Lectora_frmConsultaEnviotxtEmisionRemito (10)'), '02400000339')

WebUI.click(findTestObject('Object Repository/MELI/a_Ruta envo (9)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_CONFIRMACION RECOJO'), 'CONFIRMACION RECOJO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_ASIGNADO (9)'), 'ASIGNADO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_ASIGNADO (9)'), 'ASIGNADO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_MOTIVADO (4)'), 'MOTIVADO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_ASIGNADO (9)'), 'ASIGNADO')

WebUI.verifyElementText(findTestObject('Object Repository/MELI/td_ENTREGADO (3)'), 'ENTREGADO')

