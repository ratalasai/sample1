package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeSuite
	
	public void beforesuite() {	
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass
	
	public void beforeclass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	
	public void beforemethod() {
		System.out.println("BeforeMethod");
	}
	
	@BeforeTest
	
	public void beforetest() {
		System.out.println("BeforeTest");
	}
	
	@Test
	
	public void test() {
		System.out.println("Test");
	}
	
	@AfterTest
	
	public void aftertest() {
		System.out.println("afterTest");
	}
	
    @AfterMethod
	
	public void aftermethod() {
		System.out.println("afterMethod");
	}

	@AfterClass
	
	public void afterclass() {
		System.out.println("afterClass");
	}
	
	@AfterSuite
	
	public void aftersuite() {	
		System.out.println("afterSuite");
	}

}
