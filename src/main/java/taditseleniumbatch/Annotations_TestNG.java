package taditseleniumbatch;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_TestNG {

	//BeforeSuite > BeforeTest > BeforeClass > BeforeMethod > Test > AfterMethod > AfterClass > AfterTest > AfterSuite
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is Before Suite method");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("This is Before Test method");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is a Before Class method");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is Before Method method");
	}
	
	@Test
	public void testing() {
		System.out.println("This is a Test Method");
	} 
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is After Method method");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("This is After Class method");
	}
	
	@AfterTest
	public void aftertest() {
System.out.println("This is After Test Method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite Method");
	}
	
	
}
