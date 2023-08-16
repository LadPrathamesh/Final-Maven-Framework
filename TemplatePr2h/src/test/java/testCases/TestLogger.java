package testCases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import testBase.TestBase;

public class TestLogger extends TestBase{
	
	@Test(groups =  {"grp1"})
	public void test1() {
		logger.info("test1");
	}
	
	
	@Test(groups =  {"grp2"})
	public void test2() {
		logger.debug("test2");
	}
	
	@Test(groups =  {"grp1"})
	public void test3() {
		logger.error("test3");
	}

}
