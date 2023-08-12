package utility;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DynamicTestNGExecution {

    public static void main(String[] args) {
        // Create a TestNG instance
        TestNG testNG = new TestNG();

        // Create a suite
        XmlSuite suite = new XmlSuite();
        suite.setName("DynamicTestSuite");

        // Specify the groups you want to run
        List<String> groupsToRun = new ArrayList<>();
        groupsToRun.add("smoke");
        groupsToRun.add("regression");

        // Include the groups in the suite
        suite.setIncludedGroups(groupsToRun);

        // Create a test
        XmlTest test = new XmlTest(suite);
        test.setName("DynamicTest");

        // Add classes to the test
//        List<XmlClass> classes = new ArrayList<>();
//        classes.add(new XmlClass("testBase.TestBase"));
////        classes.add(new XmlClass("testCases.TestCases"));
//        test.setXmlClasses(classes);
        
        XmlClass testClass = new XmlClass("testCases.TestCases"); // Assuming testCases.TestCases is in src/test/java
        List<XmlClass> classes2 = new ArrayList<>();
        classes2.add(testClass);

        // Add the suite to the TestNG instance
        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        testNG.setXmlSuites(suites);

        // Run the tests
        TestListenerAdapter listener = new TestListenerAdapter();
        testNG.addListener(listener);
        testNG.run();
    }
}
