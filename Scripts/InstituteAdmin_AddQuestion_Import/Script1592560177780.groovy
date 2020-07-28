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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.e-review.jp/login/index.php')

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Page_Elsevier/input__username'), 'testuseradmin')

WebUI.setEncryptedText(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Page_Elsevier/input__password'), 
    'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Page_Elsevier/input__institutecode'), 
    'erjtest01')

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Page_Elsevier/input__loginbtn'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Page_Elsevier Review/a_'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Page_Elsevier Review/a__1'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Page_Elsevier Review/input__import_ques'))

WebUI.uploadFile(findTestObject('InstituteAdmin_AddQuestion_Import/Page_Elsevier Review/Fileupload_Question'), 'C:/Users/30346.vendor/Katalon Studio/ERJ_PROD/Data Files/Elsevier_Review_Import_Format_erjtest01.xls')

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Page_Elsevier Review/input__import'))

WebUI.verifyElementPresent(findTestObject('InstituteAdmin_AddQuestion_Import/Page_Elsevier Review/Page_Elsevier Review/div_23'), 
    10)

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Page_Elsevier Review/a__1_2'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Page_Elsevier Review/a__1'))

text = WebUI.getText(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Quetion_Text'))

println(text)

not_run: WebUI.verifyTextPresent('text', false)

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Import/Page_Elsevier Review/span_'))

WebUI.closeBrowser()

