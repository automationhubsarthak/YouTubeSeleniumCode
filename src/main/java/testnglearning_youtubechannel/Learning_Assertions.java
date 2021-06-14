package testnglearning_youtubechannel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Learning_Assertions { //Validation check points
	
	@Test
	public void ParameterA() {
		//String actual = "My channel is about Automation";
		//String expected = " My channel is about Manual";
		
		//Assert.assertEquals(actual, expected);
		Assert.assertTrue(true != false);      //is a true condition

		//Assert.fail("I am deliberately failing the testcase ParameterA");
		
		//boolean actual = 1<2; //true
   	//Assert.assertEquals(actual, expected, "need to know that logic is after I rectified stuff");
		Assert.assertTrue(true!=false, "True will never be false");
		}
	}


