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
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}
	}

}
