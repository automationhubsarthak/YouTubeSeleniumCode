package testnglearning_youtubechannel;

import org.testng.annotations.Test;
public class Always_Run {
	
	@Test(description = "Website Opening/Invoking")       //The ‘description’ attribute is used to provide a description to the test method. It generally contains a one-liner test summary.
	public void URLOpening() {
		System.out.println("This is browser opening test case");
	}
	
	@Test(invocationCount = 5 , invocationTimeOut = 2000)  //The maximum number of milliseconds this test should take for the cumulated time of all the invocationcounts. This attribute will be ignored if invocationCount is not specified.
	public void EnterProduct() {
		System.out.println("This is entering product into cart test case");
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
	
	@Test(alwaysRun = true)
	public void HomePageValidation() {
		System.out.println("This is home page validation test case");
	}
	
	@Test(timeOut = 500) //This is used to specify a timeout value for the test(in milli seconds). If test takes more than the timeout value specified, the test terminates and is marked as failure.
	public void Logout() {
		System.out.println("This is logout test case");
	}

}
