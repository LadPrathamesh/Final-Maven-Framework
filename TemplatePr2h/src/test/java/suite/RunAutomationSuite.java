package suite;

import testBase.TestBase;
import utility.TestngGroupsRunner;

public class RunAutomationSuite extends TestBase {
	static TestngGroupsRunner tgr = new TestngGroupsRunner();
	

	public static void main(String[] args) {
		try {
			tgr.runSuite();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
