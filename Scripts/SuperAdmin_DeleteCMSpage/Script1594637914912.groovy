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

WebUI.setText(findTestObject('Object Repository/SuperAdmin_DeleteCMSpage/Page_Elsevier/input__username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/SuperAdmin_DeleteCMSpage/Page_Elsevier/input__password'), 'dlraQBlqq6uE0lQDTWZ+4Q==')

WebUI.click(findTestObject('Object Repository/SuperAdmin_DeleteCMSpage/Page_Elsevier/input__loginbtn'))

WebUI.click(findTestObject('Object Repository/SuperAdmin_DeleteCMSpage/Page_Elsevier Review/a_CMS'))

WebUI.click(findTestObject('Object Repository/SuperAdmin_DeleteCMSpage/Page_Elsevier Review CMS/a_TestPage_sprite icon-delete-disabled'))

WebUI.click(findTestObject('Object Repository/SuperAdmin_DeleteCMSpage/Page_Elsevier Review CMS/input__popup_ok'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/SuperAdmin_CreateCMSpage/Page_Elsevier Review CMS/td_TestPage'), 10)

WebUI.click(findTestObject('Object Repository/SuperAdmin_DeleteCMSpage/Page_Elsevier Review CMS/span_'))

WebUI.closeBrowser()

