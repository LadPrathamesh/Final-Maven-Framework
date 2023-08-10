package MavenTemplatePr2h.TemplatePr2h;




import org.testng.annotations.Test;

import pageLayer.UIElement;
import utility.TakeScreenshot;
//import UIElement uielement;


public class TestCases extends testBase.TestBase{
	@Test 	()	// 07 Aug 2023 | Tester 1    // Sample test case
	public void testOkButton() throws InterruptedException {
		driver.get("https://www.google.com");
		UIElement uielement2 = new UIElement();
		uielement2.clickOnOk();
		logger.info("Ok Button is working");
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
//		System.out.println("This "+ ""+methodName+"");
		TakeScreenshot.takeSS("Passed TestOkButton");
		}
	
//-----------------------------------------------------------------------
//------------Write Test Cases below this line only----------------------
	
	
	
	@Test
	public void fileUpload() throws InterruptedException {
		driver.get("https://qa.archoral.com");
		Thread.sleep(500);
		uielement.enterUsername("chirag1kirad@gmail.com");
		uielement.enterPassword("Chirag@123123");
		uielement.clickOnLogin();
		driver.navigate().refresh();
		uielement.clickonSkipTour();
		uielement.openMediaTab();
		uielement.clickOnUpload();
		uielement.uploadFileFromTestData("D:\\prathamesh.lad@nanostuffs.com\\FrameworkTemplate\\Final-Maven-Framework\\TemplatePr2h\\src\\test\\java\\testData\\testJPG Image.jpg");
		TakeScreenshot.takeSS("Passed fileUpload");
		
		
		

	}
	
	
		
		
		
		
		

	

}
