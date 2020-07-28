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

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Page_Elsevier/input__username'), 'testuseradmin')

WebUI.setEncryptedText(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Page_Elsevier/input__password'), 
    'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Page_Elsevier/input__institutecode'), 'erjtest01')

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Page_Elsevier/input__loginbtn'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Page_Elsevier Review/a_'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Page_Elsevier Review/a__1'))

specilityname=WebUI.getText(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Table_path'))

println (specilityname)

WebUI.verifyMatch(specilityname, "TestScript_specility", false)

if (specilityname=="TestScript_specility") 
{
	WebUI.click(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Delete_specility'))
	WebUI.click(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Page_Elsevier Review/input__popup_ok'))
}
//WebUI.click(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Page_Elsevier Review/td_TestScript_specility'))

//WebUI.click(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Page_Elsevier Review/a_TestScript_specility_sprite bt_delete'))

//WebUI.click(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Page_Elsevier Review/input__popup_ok'))

//WebUI.click(findTestObject('Object Repository/InstituteAdmin_Delete_Speciality/Page_Elsevier Review/span_'))

WebUI.closeBrowser()

