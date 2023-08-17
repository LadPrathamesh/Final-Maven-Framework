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
import utility.GetCurrentDateTime;
import utility.TakeScreenshots;
import utility.TestngGroupsRunner;



public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	public LoginPage login;
	public UIElement uielement;
	public TakeScreenshots takeScreenshot;
	public GetCurrentDateTime getCurrentDateTime;
	public TestngGroupsRunner testngGroupsRunner;
	
		
	@BeforeClass (alwaysRun = true)
	public void start()
	{
		logger = Logger.getLogger("Frame1");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Logger Started");
	}
	
	
	
	@BeforeMethod (alwaysRun = true)
	public void setUp()
		{
		 String br = "chrome";              
		 if(br.equalsIgnoreCase("chrome"))
		{
			 	
			 ChromeOptions co = new ChromeOptions();
			 co.addArguments("--remote-allow-origins=*");
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver(co);
			 logger.info("Chrome launched"); 
		 }
		 else if (br.equalsIgnoreCase("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 logger.info("Firefox launched"); 
		 }
		 else if(br.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			 logger.info("Edge Browser launched"); 
		 }
		 else 
		 {
			 logger.info("Incorrect Browser name");
			 System.out.println("Enter valid browser name");
		 }
		 
		 driver.get("https://practicetestautomation.com/practice-test-login/");  
		 logger.info("url Loaded");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 logger.info("maximized Browser window and added waits");
		 
		 
		 
//		 com.qa.utility.ExcelHandling = new ExcelHandling();
		 login = new LoginPage();
		 uielement = new UIElement(); 
		 takeScreenshot = new TakeScreenshots();
		 getCurrentDateTime = new GetCurrentDateTime();
		 testngGroupsRunner = new TestngGroupsRunner();
		 
			
		 
		
		
	}
	
	@AfterMethod (alwaysRun = true)
	public void TakeDown()
	{
		driver.quit();
		logger.info("Browser Closed");
	}
	@AfterClass (alwaysRun = true)
	public void stop()
	{
		logger.info("Automation Suite Executed Successfully");
	}
}