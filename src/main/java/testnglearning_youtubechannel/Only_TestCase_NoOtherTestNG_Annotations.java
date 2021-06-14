package testnglearning_youtubechannel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Only_TestCase_NoOtherTestNG_Annotations {
	
	// @BeforeSuite > @BeforeTest > @BeforeClass > @BeforeMethod > @Test > @AfterMethod > @AfterClass > @AfterTest > @AfterSuite
	//@BeforeMethod and @AfterMethod > @BeforeTest and @AfterTest > @BeforeClass and @AfterClass
	
	//@Before Method , @Test, @AfterMethod - this combination repeats for each test case
	
	@BeforeMethod
	public void beforemethod() {
	System.out.println("This is a before method  body");
	}
	
	@Test
	public void launchbrowser() {
		System.out.println("This test case is about browser launch");
	}
	
	@Test
	public void loginTest() {
		System.out.println("This is a login test case");
	}
	
	@Test
	public void HomePageValidationTest() {
		System.out.println("This is a home page val. test");
	}
	
	@Test
	public void LogOut() {
		System.out.println("This is a logout test case");
	}
	
	@AfterMethod
	public void aftermethod() {
	System.out.println("This is an after  method body");
	}

}
