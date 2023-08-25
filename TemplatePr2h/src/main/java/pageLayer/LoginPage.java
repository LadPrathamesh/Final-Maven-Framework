// A seperate login page class. This is to initialize login related elements seperately.

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
//	@FindBy(xpath="//input[@id='loginemail']") 
	@FindBy(xpath="//input[@id='username']") 
	private WebElement username;  		
		  
	public void enterUsername(String email)		
	 	{ 
		  	username.sendKeys(email);
	  	}
	//====================================================================
	//Password
//	@FindBy(xpath="//input[@id='loginPassword']") 
	@FindBy(xpath="//input[@id='password']") 
	private WebElement password;  		
		  
	public void enterPassword(String pass)		
	 	{ 
		  	password.sendKeys(pass);
	  	}
	//=====================================================================
	//LoginButton Click
//	@FindBy(xpath="//button[@id='LoginButton']") 
	@FindBy(xpath="//button[@id='submit']") 
	private WebElement loginButton;  		
		  
	public void clickOnLogin()		
		{ 
		loginButton.click();
		}
	//=====================================================================
	//Tester Login before every test case
	public LoginPage login;
	public void TesterLogin(String username, String pass) {
	driver.get("https://qa.archoral.com");
//	login.enterUsername("chirag1kirad@gmail.com");
	login.enterUsername(username);
//	login.enterPassword("Chirag@123123");
	login.enterPassword(pass);
	login.clickOnLogin();
	}
	//=====================================================================
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
