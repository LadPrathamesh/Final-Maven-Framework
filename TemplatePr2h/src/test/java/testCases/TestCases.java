package testCases;




import org.testng.annotations.Test;

import pageLayer.LoginPage;
import pageLayer.UIElement;
import utility.TakeScreenshot;
import utility.TesterLogin;
//import UIElement uielement;


public class TestCases extends testBase.TestBase{
	public LoginPage login;
//	public TesterLogin login;
	
	
	@Test 	(priority = 1)	// 07 Aug 2023 | Tester 1    // Sample test case
	public void loginTest() throws InterruptedException {
		driver.get("https://qa.archoral.com");
		login.TesterLogin("chirag1kirad@gmail.com", "Chirag@123123");
//		login.enterUsername("chirag1kirad@gmail.com");
//		login.enterPassword("Chirag@123123");
//		login.clickOnLogin();
		TakeScreenshot.takeSS("Passed_passwordLogin");
		}
	
//=========================================================================
//------------Write Test Cases below this line only----------------------
	
	
// Upload file	
	@Test
	public void fileUpload() throws InterruptedException {
		driver.get("https://qa.archoral.com");
		Thread.sleep(500);
		login.enterUsername("chirag1kirad@gmail.com");
		login.enterPassword("Chirag@123123");
		login.clickOnLogin();
		driver.navigate().refresh();
		uielement.clickonSkipTour();
		uielement.openMediaTab();
		uielement.clickOnUpload();
		uielement.uploadFileFromTestData("D:\\prathamesh.lad@nanostuffs.com\\FrameworkTemplate\\Final-Maven-Framework\\TemplatePr2h\\src\\test\\java\\testData\\testJPG Image.jpg");
		TakeScreenshot.takeSS("Passed fileUpload");
	}
//============================================================================	
	
		
		
		
		
		

	
	
	
	

}
