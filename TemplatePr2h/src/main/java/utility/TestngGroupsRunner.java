package utility;

//import org.apache.log4j.Logger;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import testBase.TestBase;

import java.io.IOException;
import java.util.Arrays;

public class TestngGroupsRunner extends TestBase{
	
	static ExtentReporterNG extentReporter = new	ExtentReporterNG();
	static ListenersEx listeners = new ListenersEx();
//	static Logger logger;
	
	
    
	public static void main(String[] args) throws InterruptedException {
		TestBase tb = new TestBase();
		tb.start();
		logger.info("Running TestCases Through Excel");
        TestNG testng = new TestNG();
        logger.info("Testng Initialized");
        
        testng.addListener(extentReporter);
        testng.addListener(listeners);
        logger.info("Listeners Added");
        

        
        XmlSuite suite = new XmlSuite();
        suite.setName("Excel Based Suite");
        logger.info("XmlSuite Created (Excel Based Suite)");
        
        XmlTest test = new XmlTest(suite);
        test.setName("Excel Based Regression Testing");

        
        XmlClass testClass = new XmlClass("testCases.TestCases"); 
        test.setXmlClasses(Arrays.asList(testClass));
        logger.info("TestClasses Initialized");
       
        
        
        Object excelValue = null;
        Thread.sleep(1000);
        
        ExcelHandling getValue = new ExcelHandling();
        logger.info("ExcelHandling class Initialized");
        try {
        	excelValue = getValue.getCellValue(0, 3, 5);
        	logger.info("Excel Values taken");
			
		} catch (IOException e) {
			logger.info("unable to get Excel values");
			e.printStackTrace();
		}
        
        

        String excelValue2 = String.valueOf(excelValue);

		test.addIncludedGroup(excelValue2);
//        test.addIncludedGroup("Regression");
        
        suite.setTests(Arrays.asList(test));

        
        testng.setXmlSuites(Arrays.asList(suite));
        testng.setOutputDirectory("test-Output-Programmatic"); 
        logger.info("Test output file created");

        
        testng.run();
        logger.info("Testng Executed via main method");
    }
}
