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

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier/input__username'), 'testuseradmin')

WebUI.setEncryptedText(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier/input__password'), 
    'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier/input__institutecode'), 
    'erjtest01')

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier/input__loginbtn'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/a_'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/a__1'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/input__add_ques'))

WebUI.selectOptionByValue(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/select_'), 
    'multichoice', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/select_ 2021  2020  2019  2018  2017  2016 _c5e575'), 
    '2021', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/select_Super SpecialityApril testManInstAug_ec4b91'), 
    '594', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/select_Augne_sub'), 
    '596', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/select_ (1)'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/select_USMLE'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/select__1'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/select__1_2'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/select__1_2_3'), 
    '2', true)

WebUI.switchToFrame(findTestObject('InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/iframe_Edit HTML Source_tiny_ifr'), 
    10)

WebUI.setText(findTestObject('InstituteAdmin_AddQuestion_Manually/Question _Description'), 'Testscript_Automation_Questions')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/iframe_Edit HTML Source_elm0_ifr'), 
    10)

WebUI.setText(findTestObject('InstituteAdmin_AddQuestion_Manually/Option_1'), '11')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/iframe_Edit HTML Source_elm1_ifr'), 
    10)

WebUI.setText(findTestObject('InstituteAdmin_AddQuestion_Manually/Option_2'), '33')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/iframe_Edit HTML Source_elm2_ifr'), 
    10)

WebUI.setText(findTestObject('InstituteAdmin_AddQuestion_Manually/Option_3'), '44')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/iframe_Edit HTML Source_elm3_ifr'), 
    10)

WebUI.setText(findTestObject('InstituteAdmin_AddQuestion_Manually/Option_4'), '55')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/input__correct'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/input__btnbg submitbtn wd-px-100'))

//questioncreated=WebUI.getText(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/div_'))

questioncreated=WebUI.getText(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Successmsg'))
WebUI.verifyMatch(questioncreated, "問題が追加されました", false)

not_run: WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/a__sprite a_delete'))

not_run: WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/input__popup_ok'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddQuestion_Manually/Page_Elsevier Review/span_'))

WebUI.closeBrowser()

