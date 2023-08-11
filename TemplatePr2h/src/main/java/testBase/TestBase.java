package testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageLayer.LoginPage;
import pageLayer.UIElement;
import utility.TakeScreenshots;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	public UIElement uielement;
	public TakeScreenshots takeScreenshot;
	public LoginPage login;
	
	
	
	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("Frame1");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Logger Started");
		
		
		
	}
	
	@AfterClass
	public void stop()
	{
		logger.info("Framework exection Stopped");
	}
	
	@BeforeMethod
	public void setUp()
	{
		 String br = "chrome";              
		 if(br.equalsIgnoreCase("chrome"))
		 {
			 	
			 ChromeOptions co = new ChromeOptions();
			 co.addArguments("--remote-allow-origins=*");
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver(co);
			 logger.info("Chrome launches"); 
		 }
		 else if (br.equalsIgnoreCase("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
		 else if(br.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		 }
		 else 
		 {
			 System.out.println("Enter valid browser name");
		 }
		 
		 driver.get("https://www.google.com");  // Application URL
		 logger.info("url Loaded");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 logger.info("maximized Browser window");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 
		 
		 
//		 com.qa.utility.ExcelHandling = new ExcelHandling();
		 login = new LoginPage();
		 uielement = new UIElement(); // Page class is initiated.
		 takeScreenshot = new TakeScreenshots();
		 
		 
			
		 
		
		
	}
	
	@AfterMethod
	public void TakeDown()
	{
		driver.quit();
		logger.info("Browser Closed");
	}
}