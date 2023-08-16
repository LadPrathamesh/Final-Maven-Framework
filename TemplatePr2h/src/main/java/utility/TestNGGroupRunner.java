package utility;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import java.util.ArrayList;
import java.util.List;

public class TestNGGroupRunner {

    public static void main(String[] args) {
        // Create a TestNG instance
        TestNG testNG = new TestNG();

        // Create a suite
        XmlSuite suite = new XmlSuite();
        suite.setName("Suite");  // Replace with suite name

        // Specify the groups you want to run
        List<String> groupsToRun = new ArrayList<>();
        groupsToRun.add("smoke");  // Replace with first group name
        groupsToRun.add("regression");  // Replace with second group name

        // Include the groups in the suite
        suite.setIncludedGroups(groupsToRun);

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
