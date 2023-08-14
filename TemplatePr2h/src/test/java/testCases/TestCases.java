package testCases;




import org.testng.annotations.Test;






public class TestCases extends testBase.TestBase{
	

	
	
	@Test 		// 07 Aug 2023 | Tester 1    // Sample test case
	public void loginTest() throws InterruptedException {
		driver.get("https://www.google.com");
//		login.TesterLogin("chirag1kirad@gmail.com", "Chirag@123123");
//		login.enterUsername("chirag1kirad@gmail.com");
//		login.enterPassword("Chirag@123123");
//		login.clickOnLogin();
		takeScreenshot.takeSS("Passed_passwordLogin");
		}
	
//=========================================================================
//------------Write Test Cases below this line only----------------------
	
	
// Upload file	
	@Test (groups = "smoke")
	public void fileUpload() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		login.enterUsername("chirag1kirad@gmail.com");
		login.enterPassword("Chirag@123123");
		login.clickOnLogin();
		driver.navigate().refresh();
		uielement.clickonSkipTour();
		uielement.openMediaTab();
		uielement.clickOnUpload();
//		uielement.uploadFileFromTestData("D:\\prathamesh.lad@nanostuffs.com\\FrameworkTemplate\\Final-Maven-Framework\\TemplatePr2h\\src\\test\\java\\testData\\testJPG Image.jpg");
		takeScreenshot.takeSS("Passed fileUpload");
	}
//============================================================================	
	
		
		
		
		
		

	
	
	
	

}
