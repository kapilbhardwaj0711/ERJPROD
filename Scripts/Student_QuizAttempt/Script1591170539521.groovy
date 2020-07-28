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

WebUI.setText(findTestObject('Object Repository/Student_QuizAttempt/Page_Elsevier/input__username'), 'loadstudent004')

WebUI.setEncryptedText(findTestObject('Object Repository/Student_QuizAttempt/Page_Elsevier/input__password'), 'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/Student_QuizAttempt/Page_Elsevier/input__institutecode'), 'erjtest01')

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_Elsevier/input__loginbtn'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_Elsevier Review/a_'))

WebUI.waitForElementPresent(findTestObject('Student_QuizAttempt/Page_Elsevier Review/a_Test Automation'), 10)

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_Elsevier Review/a__1'))

not_run: WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_Elsevier Review Test Automation/h2_'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_Elsevier Review Test Automation/button_'))

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__answerPreview'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__next'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input_CaPTH_answerPreview'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__next'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input_Impairment of galactose absorption_an_b67d9f'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__next'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input_Arachidonic acid_answerPreview'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__next'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__answerPreview_1'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__next'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input_C_answerPreview'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__next'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input_C_answerPreview_1'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__next'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input_C_answerPreview_1_2'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__next'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input_ _answerPreview'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__next'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input_C_answerPreview_1_2_3'))

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_/input__next'))

WebUI.click(findTestObject('NewSubmit/Page_/Finish'))

WebUI.switchToWindowTitle('Elsevier Review: Test Automation')

not_run: WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_Elsevier Review Test Automation/div_20'))

WebUI.click(findTestObject('NewSubmit/Page_Elsevier Review test/FinishAndSubmit'))

WebUI.verifyElementPresent(findTestObject('Student_SelfLearningAttempt/Apply Understanding element'), 10)

WebUI.click(findTestObject('Object Repository/Student_QuizAttempt/Page_Elsevier Review Test Automation/span_'))

WebUI.closeBrowser()

