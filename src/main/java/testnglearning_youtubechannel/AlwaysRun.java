package testnglearning_youtubechannel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
	//Let's say for example you have a test case. And it failed. There is another test case which is dependent on the test case that failed. So if the first test case failed and the 2nd one is dependent
	//on the first one then obviously it will fail. 
	//alwaysRun = true
	
	@Test
	public void Login() {
		System.out.println("This is login test case");
		Assert.fail("Deliberately failing this");
	}
	//alwaysRun = true cannot override the execution of enabled = false - this is not allowed
	
	@Test(dependsOnMethods = "Login", alwaysRun = true) //it will execute the test case even if it is dependent on a Failed Test Case
	public void LogOut() {
		System.out.println("This is LogOut test case");
	}
	

}
