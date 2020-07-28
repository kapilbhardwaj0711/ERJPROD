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

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_Elsevier/input__username'), 'loadstudent004')

WebUI.setEncryptedText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_Elsevier/input__password'), 
    'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_Elsevier/input__institutecode'), 'erjtest01')

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_Elsevier/input__loginbtn'))

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_Elsevier Review/a_'))

WebUI.verifyElementPresent(findTestObject('Student_Follow-up_Test_Attempt/Page_Elsevier Review/a_Follow-Up Test Automation'), 
    5)

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_Elsevier Review/a__1'))

title = WebUI.getWindowTitle()

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_Elsevier Review Follow-Up Test Automation/button_'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__answerPreview'), '22')

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__next'))

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__answerPreview'), '22')

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__next'))

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__answerPreview'), '44')

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__next'))

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__answerPreview'), '22')

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__next'))

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__answerPreview'), '44')

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__next'))

WebUI.click(findTestObject('NewSubmit/Page_/Finish'))

WebUI.switchToWindowTitle(title)

WebUI.click(findTestObject('NewSubmit/Page_Elsevier Review test/FinishAndSubmit'))

WebUI.delay(1000)

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_Elsevier Review Follow-Up Test Automation/a_'))

WebUI.verifyElementPresent(findTestObject('Student_Follow-up_Test_Attempt/Page_Elsevier Review/a_Follow-Up Test Automation -'), 
    0)

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_Elsevier Review/a_Follow-Up Test Automation -'))

title1 = WebUI.getWindowTitle()

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_Elsevier Review Follow-Up Test Automation -/button_'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__answerPreview'), '23')

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__next'))

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__answerPreview'), '22')

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__next'))

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__answerPreview'), '41')

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__next'))

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__answerPreview'), '22')

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__next'))

WebUI.setText(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__answerPreview'), '44')

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_/input__next'))

WebUI.click(findTestObject('NewSubmit/Page_/Finish'))

WebUI.switchToWindowTitle(title1)

WebUI.click(findTestObject('NewSubmit/Page_Elsevier Review test/FinishAndSubmit'))

WebUI.verifyElementPresent(findTestObject('Student_SelfLearningAttempt/Apply Understanding element'), 10)

WebUI.click(findTestObject('Object Repository/Student_Follow-up_Test_Attempt/Page_Elsevier Review Follow-Up Test Automation -/span_'))

WebUI.closeBrowser()

