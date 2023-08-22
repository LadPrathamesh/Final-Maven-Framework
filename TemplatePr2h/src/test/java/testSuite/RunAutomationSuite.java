package testSuite;

import testBase.TestBase;
import utility.TestngRunner;

public class RunAutomationSuite extends TestBase {
	static TestngRunner tgr = new TestngRunner();
	public static String browser;

	public static void main(String[] args) {
		try {
			browser = "chrome"; 
			tgr.runSuite();
			System.out.println("Test Conflict 1");
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}
	}

}
