package testnglearning_youtubechannel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Annotations {
	
	//Precedence Wise Execution:- 
	//Interview Questions - what are the different TestNG annotations that you know ? How many did you use ? What is the precedence ?
	// @BeforeSuite > @BeforeTest > @BeforeClass > @BeforeMethod > @Test > @AfterMethod > @AfterClass > @AfterTest > @AfterSuite
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite Annotation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test Annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class Annotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method Annotation");
	}
   
	@Test
	public void logintest() {
		System.out.println(" This is a Login Test Case");
	}
	
	@Test
	public void regtest() {
		System.out.println("This is a Registration Test Case");
	} 
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method Annotation");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class Annotation");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test Annotation");
	}
	
	@AfterSuite
	 public void afterSuite() {
		System.out.println("This is After Suite Annotation");
	}

}

