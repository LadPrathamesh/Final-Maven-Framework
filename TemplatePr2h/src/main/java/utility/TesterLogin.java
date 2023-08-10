package utility;

import pageLayer.LoginPage;
import testBase.TestBase;

public class TesterLogin extends TestBase{
	public LoginPage login;
	public void TesterLogin(String username, String pass) {
	driver.get("https://qa.archoral.com");
//	login.enterUsername("chirag1kirad@gmail.com");
	login.enterUsername(username);
//	login.enterPassword("Chirag@123123");
	login.enterPassword(pass);
	login.clickOnLogin();
	}
}