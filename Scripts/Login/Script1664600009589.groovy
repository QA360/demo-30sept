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

WebUI.navigateToUrl('http://172.16.24.74:30140/welcome')
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/login/Page_eNlight 360 - Login/input_Login_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_eNlight 360 - Login/input_Login_password'), 'cvW8qx4B2o1gIDzvWT+0mQ==')

WebUI.click(findTestObject('Object Repository/login/Page_eNlight 360 - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/login/Page_eNlight 360 - Dashboard/a_Virtual Machines'))

WebUI.switchToWindowTitle('eNlight 360° : Virtual Machine')

WebUI.selectOptionByValue(findTestObject('Object Repository/login/Page_eNlight 360  Virtual Machine/select_-All Regions-    Default RegionEastWest'), 
    '0afbcbf1-d1e9-11ec-81fa-3aa2f4344e9c', true)

WebUI.click(findTestObject('Object Repository/login/Page_eNlight 360  Virtual Machine/i_Admin_fa fa-bars showmenu'))

WebUI.click(findTestObject('Object Repository/login/Page_eNlight 360  Virtual Machine/i_Admin_fa fa-users'))

WebUI.click(findTestObject('Object Repository/login/Page_eNlight 360 - Dashboard/span_Master Admin'))

WebUI.click(findTestObject('Object Repository/login/Page_eNlight 360 - Dashboard/a_Logout'))

WebUI.closeBrowser()

