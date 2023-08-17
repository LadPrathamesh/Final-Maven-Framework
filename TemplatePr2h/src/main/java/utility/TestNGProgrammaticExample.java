package utility;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import utility.ExtentReporterNG;
import testBase.TestBase;

import java.util.Arrays;

public class TestNGProgrammaticExample extends TestBase{
	
	static ExtentReporterNG extentReporter = new	ExtentReporterNG();
	static ListenersEx listeners = new ListenersEx();
	
    
	public static void main(String[] args) {
        // Create a TestNG instance
        TestNG testng = new TestNG();

        // Add listeners to TestNG
        testng.addListener(extentReporter);
        testng.addListener(listeners);
        

        // Create an XML suite
        XmlSuite suite = new XmlSuite();
        suite.setName("Suite2");

        // Create an XML test
        XmlTest test = new XmlTest(suite);
        test.setName("Test2");

        // Add classes to the test
        XmlClass testClass = new XmlClass("testCases.TestCases"); 
        test.setXmlClasses(Arrays.asList(testClass));

        // Set groups to run
        test.addIncludedGroup("Smoke");
        test.addIncludedGroup("Sanity");

        // Add the test to the suite
        suite.setTests(Arrays.asList(test));

        // Add the suite to TestNG
        testng.setXmlSuites(Arrays.asList(suite));
        testng.setOutputDirectory("Output-Programmatic"); 

        // Run the tests
        testng.run();
    }
}