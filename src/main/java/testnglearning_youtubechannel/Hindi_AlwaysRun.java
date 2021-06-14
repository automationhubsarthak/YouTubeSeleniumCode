package testnglearning_youtubechannel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hindi_AlwaysRun {
	
	//alwaysRun = true (when TestNG skips execution of a Test case for whatever reason, and you want that Test Case to execute then we use alwaysRun = true)
	//alwaysRun = true in compared to enabled = false
	
	@Test(priority = 1)
	public void Begin() {
		System.out.println("This is the initial test case");
		Assert.fail("We are failing this test case");
	}
	
	@Test(priority = 2, dependsOnMethods = "Begin", alwaysRun = true)
	public void Ready() {
		System.out.println("This is the next test case");
	}

	 @Test(priority = 3, dependsOnMethods = { "Begin", "Ready"}, alwaysRun = true )
	 public void Steady() {
		 System.out.println("This is the next sequence test case");
	 }
	 
	 @Test(priority = 4, dependsOnMethods = { "Begin", "Ready", "Steady"}, alwaysRun = true, enabled = false)
	 public void Go() {
		 System.out.println("This is the Go test case");
	 }
}
