package testCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class TestCases2 extends TestBase{
	
	
	@Test (groups = {"Smoke","Sanity","Regression"})


	public void fileUpload() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(5000);
//		login.enterUsername("chirag1kirad@gmail.com");
//		login.enterPassword("Chirag@123123");
//		login.clickOnLogin();
//		driver.navigate().refresh();
//		uielement.clickonSkipTour();
//		uielement.openMediaTab();
//		uielement.clickOnUpload();
//		uielement.uploadFileFromTestData("D:\\prathamesh.lad@nanostuffs.com\\FrameworkTemplate\\Final-Maven-Framework\\TemplatePr2h\\src\\test\\java\\testData\\testJPG Image.jpg");
		takeScreenshot.takeSS("Passed fileUpload");
	}

}
