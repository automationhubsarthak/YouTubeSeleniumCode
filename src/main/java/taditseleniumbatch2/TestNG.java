package taditseleniumbatch2;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeTest
	public void setUp() {
		System.out.println("The initial code to set things up");
	}
	
	
	@Test(priority = 6, enabled = false)
	public void notImportant() {
		System.out.println("I may choose not to run this testcase");
	}
	
	@Test(priority = 5, successPercentage = 100)
	public void apple() {
		System.out.println("This is the first test");
		//throw new SkipException("Skipping at my own peril");
	}
	
	@Test(priority = 4, alwaysRun = true, invocationCount = 5, invocationTimeOut = 800) //each time it executes it takes 200 ms, 5 times will take = 1000 ms
	public void ball() {         //invocationTimeOut only works if invocationCount is mentioned.
		System.out.println("This is the second test");
	}
	
	@Test(priority = 1, timeOut = 100)
	public void cat() {
		System.out.println("This is the third test");
	}
	
	@Test(priority = 2, description = "I have a dog and it is a Labrador", dependsOnMethods = {"cat" , "apple"})
	public void dog() {
		System.out.println("This is the fourth test");
	}
	
	@Test (priority = 3)
	public void elephant() {
		System.out.println("This is the fifth test");
	}
	
	@Test(groups = "smoketest")          // Used to specify the groups, the test method belongs to.
	public void LoginPageOpen() {
		System.out.println("This is Login Page Opening test case");
	}
	
	@Test(groups = {"smoketest" , "sanitytest"})
	public void InvalidCredentials() {
		System.out.println("This is entering invalid credentials test case");
	}
	
	@Test(dependsOnGroups = "smoketest")    //Used to specify the groups on which the test method depends.
	public void ValidCredentials() {
		System.out.println("This is entering valid credentials");
	}
	
	@AfterTest 
	public void tearDown() {
		System.out.println("This is closure");
	}

}
