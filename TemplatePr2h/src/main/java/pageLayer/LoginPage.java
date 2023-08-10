package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Login ID
	@FindBy(xpath="//input[@id='loginemail']") 
	private WebElement username;  		
		  
	public void enterUsername(String email)		
	 	{ 
		  	username.sendKeys(email);
	  	}
	//====================================================================
	//Password
	@FindBy(xpath="//input[@id='loginPassword']") 
	private WebElement password;  		
		  
	public void enterPassword(String pass)		
	 	{ 
		  	password.sendKeys(pass);
	  	}
	//=====================================================================
	//LoginButton Click
	@FindBy(xpath="//button[@id='LoginButton']") 
	private WebElement loginButton;  		
		  
	public void clickOnLogin()		
		{ 
		loginButton.click();
		}
	//=====================================================================

}
