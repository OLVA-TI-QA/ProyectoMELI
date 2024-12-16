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

WebUI.click(findTestObject('Object Repository/MELI/span_Distribucion (1)'))

WebUI.click(findTestObject('Object Repository/MELI/span_Siniestrar Envo (1)'))

WebUI.click(findTestObject('Object Repository/MELI/input_PISTOLEAR TRACKING_frmSiniestrarcodigoBarras (1)'))

WebUI.setText(findTestObject('Object Repository/MELI/input_PISTOLEAR TRACKING_frmSiniestrarcodigoBarras (1)'), '02400000886')

WebUI.click(findTestObject('Object Repository/MELI/label_Seleccionar'))

WebUI.click(findTestObject('Object Repository/MELI/li_CASOS ESER'))

WebUI.click(findTestObject('Object Repository/MELI/span_GRABAR (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Grabado Exitoso (1)'), 'Grabado Exitoso.')

WebUI.setText(findTestObject('Object Repository/MELI/input_PISTOLEAR TRACKING_frmSiniestrarcodigoBarras (1)'), '02400000894')

WebUI.click(findTestObject('Object Repository/MELI/label_Seleccionar'))

WebUI.click(findTestObject('Object Repository/MELI/li_CASOS ESER'))

WebUI.click(findTestObject('Object Repository/MELI/span_GRABAR (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Seleccione un motivo correcto para env_a01cd0'), 'Seleccione un motivo correcto para envíos MercadoLibre')

WebUI.click(findTestObject('Object Repository/MELI/span_CASOS ESER_ui-icon ui-icon-triangle-1-s ui-c'))

WebUI.click(findTestObject('Object Repository/MELI/li_Seleccionar'))

WebUI.click(findTestObject('Object Repository/MELI/span_GRABAR (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/MELI/span_Seleccione un motivo para envos MercadoLibre'), 'Seleccione un motivo para envíos MercadoLibre')

