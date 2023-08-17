package utility;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import java.util.ArrayList;
import java.util.List;

public class TestNGGroupRunner {

    public static void main(String[] args) {
        // Create an instance of TestNG
        TestNG testng = new TestNG();

        // Create a dynamic XML suite
        XmlSuite suite = new XmlSuite();
        suite.setName("Suite");

<<<<<<< Updated upstream
        // Specify the groups you want to run
        List<String> groupsToRun = new ArrayList<>();
        groupsToRun.add("smoke");  // Replace with first group name
        groupsToRun.add("regression");  // Replace with second group name
=======
        // Create a dynamic XML test
        XmlTest test = new XmlTest(suite);
        test.setName("Test");
>>>>>>> Stashed changes

        // Add groups dynamically
        List<String> includedGroups = new ArrayList<>();
        includedGroups.add("Smoke");
        includedGroups.add("Regression");
        test.setIncludedGroups(includedGroups);

        // Set classes for the test
        List<XmlClass> classes = new ArrayList<>();
        classes.add(new XmlClass("testCases.TestCases")); // Replace with your actual class name
        test.setXmlClasses(classes);

        // Add the test to the suite
        suite.addTest(test);

        // Set suites to TestNG
        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        testng.setXmlSuites(suites);

        // Run the TestNG suite
        testng.run();
    }
}
