package testnglearning_youtubechannel;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Learning {
	//Step 1 - you will have to create the object of the SoftAssert class. 
	//Step 2 - you need to invoke the method assertAll()
	
	@Test
	public void SoftTestCaseValiadtion() {
		SoftAssert softassert = new SoftAssert();
		System.out.println("I am writing a test script");
		softassert.assertTrue(false);        //you are asserting or applying a validation condition that it is false
		
		System.out.println("I am writing a Java logic");
		softassert.assertTrue(true);   //you are asserting or applying a validation condition that it is true

		softassert.assertAll(); //Why the introduction of assertAll() method is giving the right results ? 
		                                   //Answer : SoftAssert will mention all the exceptions within the same test case if at the end of all the logic we invoke the method assertAll()
}
}
