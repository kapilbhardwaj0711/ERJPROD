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

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier/input__username'), 'testuseradmin')

WebUI.setEncryptedText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier/input__password'), 
    'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier/input__institutecode'), 'erjtest01')

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier/input__loginbtn'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/a_'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/a__1'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/input__add_user'))

WebUI.selectOptionByValue(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/select_----                                _62d4a0'), 
    '5', true)

Random rand = new Random()

num = rand.nextInt(5000)

String username = 'CreatedByTestscript' + num

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/input__user'), username)

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/form_                                      _89fe23'))

not_run: WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/input__user'), 
    'CreatedByTestscript')

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/input__last_name'), username)

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/input__first_name'), 
    username)

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/input__fur_lastname'), 
    username)

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/input__fur_firstname'), 
    username)

WebUI.setEncryptedText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/input__password'), 
    'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/input__conf_pass'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/input__submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/div_'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/span_'))

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier/input__username'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier/input__password'), 
    'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier/input__institutecode'), 'erjtest01')

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier/input__loginbtn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/span__1'), 
    0)

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/input_ 2013829_btnsubmit'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Manual/Page_Elsevier Review/span_'))

WebUI.closeBrowser()

