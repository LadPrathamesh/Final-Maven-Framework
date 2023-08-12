package utility;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;
import testBase.TestBase;
//import utility.TakeScreenshots;
public class ListenersEx extends TestBase implements ITestListener {
    

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Test Case Execution started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test Case Executed Successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("Test Case Execution Failed");
        takeScreenshot.takeSS("Failed_" + result.getName()); // Use 'takescreenshot' instead of 'takeScreenshot'
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info("Test Case Skipped");
    }
}
