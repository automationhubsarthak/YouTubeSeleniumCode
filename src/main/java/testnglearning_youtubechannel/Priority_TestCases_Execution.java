package testnglearning_youtubechannel;

import org.testng.annotations.Test;

public class Priority_TestCases_Execution {
	//Interview Questions:- Que : What if I want a particular test case to run first ?
	 //                                  Ans : make it priority = 1 and make sure other test cases also get a priority, else TestNG will follow Alphabetical Sequence
	                              //    Que = how to disable a test case ?? Ans : enabled = false
	@Test(priority = 4 , enabled = true)
	public void Apple() {
		System.out.println("This test case has alphabet A");
	}
	
	@Test(priority = 1 , enabled = true)
	public void Balloon() {
		System.out.println("This test case has alphabet B");
	}
	
	@Test (priority = 3, enabled = true)
	public void Coding() {
		System.out.println("This test case has alphabet C");
	}
	
  @Test(priority = 2, enabled = false)
  public void Zebra() {
	  System.out.println("This test case has alphabet Z");
  }
	
	

}
