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

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier/input__username'), 'testuseradmin')

WebUI.setEncryptedText(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier/input__password'), 'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier/input__institutecode'), 'erjtest01')

WebUI.click(findTestObject('InstituteAdmin_Create_Test/Page_Elsevier/input__loginbtn'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/a_'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/a__1'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('InstituteAdmin_Create_Test/Page_Elsevier Review/input__title'), 10)

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/input__title'), 'Test Automation')

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/input__manual_selection_of_problem'))

WebUI.selectOptionByValue(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/select_                                    _c20dc3'), 
    'multichoice', true)

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/span__add142748'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/span__add77143'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/span__add77144'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/span__add77145'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/span__add77146'))

not_run: WebUI.scrollToElement(findTestObject('InstituteAdmin_Create_Test/Page_Elsevier Review/span__add77147'), 10)

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/span__add77147'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/span__add77148'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/span__add77149'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/span__add134472'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/span__add29882'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/input__nextbutton'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/li_loadstudent001 loadstudent001 (loadstudent001)'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/li_loadstudent002 loadstudent002 (loadstudent002)'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/li_loadstudent003 loadstudent003 (loadstudent003)'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/li_loadstudent004 loadstudent004 (loadstudent004)'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/li_loadstudent005 loadstudent005 (loadstudent005)'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/div_student001  student001 (testuserstudent_706711'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/input__nextbutton'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/input__popup_ok'))

//WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/font_'))

createdTest=WebUI.getText(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/font_'))

WebUI.verifyMatch(createdTest, "テストは作成されました", false)
WebUI.click(findTestObject('Object Repository/InstituteAdmin_Create_Test/Page_Elsevier Review/span_'))

WebUI.closeBrowser()

