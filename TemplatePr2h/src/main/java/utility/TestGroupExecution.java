package utility;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

public class TestGroupExecution {
    public static void main(String[] args) {
        // List of group names to include in the run
        List<String> groupsToRun = new ArrayList<>();
        groupsToRun.add("Smoke");
        groupsToRun.add("Regression");

        // Create a TestNG object and define a suite
        TestNG testng = new TestNG();
        XmlSuite suite = new XmlSuite();
        suite.setName("DynamicSuite");

        // Create a test and set the groups
        XmlTest test = new XmlTest(suite);
        test.setName("DynamicTest");
        test.setIncludedGroups(groupsToRun);

        // Add classes to the test (you might loop through your classes here)
        List<XmlClass> classes = new ArrayList<>();
        classes.add(new XmlClass("testCases.TestCases")); // Modify with your actual class name
        test.setXmlClasses(classes);

        // Add the test to the suite
        suite.addTest(test);

        // Set the suite to the TestNG object and run
        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        testng.setXmlSuites(suites);
        testng.run();
    }
}
