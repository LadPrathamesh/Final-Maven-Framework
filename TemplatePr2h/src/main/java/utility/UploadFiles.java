package utility;

import org.openqa.selenium.WebElement;

import testBase.TestBase;

public class UploadFiles extends TestBase {
	
	public void UploadFile(WebElement UploadButton, String filePath) {
		
		UploadButton.sendKeys(filePath);
		
	}

}
