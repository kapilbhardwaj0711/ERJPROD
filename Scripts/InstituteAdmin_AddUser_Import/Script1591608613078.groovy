import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Toolkit as Toolkit
import java.awt.event.KeyEvent as KeyEvent
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
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

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Import/Page_Elsevier/input__username'), 'testuseradmin')

WebUI.setEncryptedText(findTestObject('Object Repository/InstituteAdmin_AddUser_Import/Page_Elsevier/input__password'), 
    'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/InstituteAdmin_AddUser_Import/Page_Elsevier/input__institutecode'), 'erjtest01')

WebUI.click(findTestObject('InstituteAdmin_AddUser_Import/Page_Elsevier/input__loginbtn'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Import/Page_Elsevier Review/a_'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Import/Page_Elsevier Review/a__1'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Import/Page_Elsevier Review/input__user_export'))

WebUI.uploadFile(findTestObject('InstituteAdmin_AddUser_Import/Page_Elsevier Review/fileUpload'), 'C:\\Users\\30346.vendor\\Katalon Studio\\ERJ_PROD\\Data Files\\User_template.xls')

//Runtime.getRuntime().exec('D:/Katalon_Studio_Windows_64-7.4.0/WinPopUP.exe')
//String text = "C:/Users/30346.vendor/Katalon Studio/ERJ_PROD/Data Files/User_template.xls";
//
//StringSelection stringSelection = new StringSelection(text);
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null)
//
//WebUI.delay(2)
//Robot robot = new Robot() 
//
//robot.keyPress(KeyEvent.VK_CONTROL)'' 
//robot.keyPress(KeyEvent.VK_V);
//robot.keyRelease(KeyEvent.VK_CONTROL)
//robot.keyRelease(KeyEvent.VK_V);
//
//robot.keyPress(KeyEvent.VK_TAB); 
//robot.keyPress(KeyEvent.VK_TAB) 
//robot.keyPress(KeyEvent.VK_ENTER); 
//robot.keyRelease(KeyEvent.VK_ENTER);
WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Import/Page_Elsevier Review/input_User_templatexls_import'))

result=WebUI.getText(findTestObject('Object Repository/InstituteAdmin_AddUser_Import/Page_Elsevier Review/div_ CreatedByAutomationScript01'))

println (result)

//println (Username)
/*if (result.contains("ユーザー名")) 
{
	println ("User is creadted successfully")
}
else
{
	  println ("user is alreadys created")
}
*/
//WebUI.verifyTextPresent(result.contains(' ユーザー名 '), false, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Import/Page_Elsevier Review/div_ CreatedByAutomationScript01'))

WebUI.click(findTestObject('Object Repository/InstituteAdmin_AddUser_Import/Page_Elsevier Review/span_'))

WebUI.closeBrowser()

