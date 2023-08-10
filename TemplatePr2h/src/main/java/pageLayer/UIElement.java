package pageLayer;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;
import utility.UploadFiles;

public class UIElement extends TestBase{
public UploadFiles upload;	
	public  UIElement() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
// Write xpaths and give their names in the below format
	
	
@FindBy(xpath="//*[@id=\"gb\"]/div/div[1]/div/div[1]/a") // write Xpath of webelement here
private WebElement OkButton;  		// Name of the xpath
	  
public void clickOnOk ()		// This method to be called in the @test cases.
 	{ 
	  	OkButton.click(); // Selenium methods to perform operation on the WebElement.
  	}

// Write xpaths and give action name in the above format 


//--------------------------------------------------------------------------
//--------------------------------------------------------------------------
// -----------------Write code below this line only ------------------------



//Click on Skip Tour
@FindBy(xpath="//button[text()='Skip Tour']") 
private WebElement skipTourBtn;  		
	  
public void clickonSkipTour()		
	{ 
	skipTourBtn.click();
	}
//=====================================================================
//Open Media
@FindBy(xpath="//a[@href='https://qa.archoral.com/media']") 
private WebElement OpenMedia;  		
	  
public void openMediaTab()		
	{ 
	OpenMedia.click();
	}
//=====================================================================
//Click on Upload
@FindBy(xpath="(//a[@href='https://qa.archoral.com/upload'])[1]") 
private WebElement UploadBtn;  		
	  
public void clickOnUpload()		
	{ 
	UploadBtn.click();
	}
//=====================================================================
//Upload file From computer
@FindBy(xpath="//input[@id='input-file-now']") 
private WebElement UploadBtn2;  		
	  
public void uploadFileFromTestData(String filePath)		
	{ 
	upload.UploadFile(UploadBtn2, filePath);
	

//	upload.UploadFiles(filePath);
	}
//=====================================================================



















}
