package testnglearning_youtubechannel;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_vs_SoftAssert {
	
	@Test
	public void HardAssertionLogic() {
		System.out.println("This is my first statement");  //1st logic
		Assert.assertTrue(true);                   //1st hard assertion/validation
		
		int i = 100; int j = 50;
		System.out.println("The sum is :" + (i + j));     //2nd logic
		Assert.assertTrue(false);                                 //2nd hard assertion/validation
		
		System.out.println("this is my last logic statement inside this HardAssertionLogic test case");          //3rd logic
		Assert.assertTrue(true);                                                                                                                     //3rd hard assertion/validation
	}
	
	
	@Test
	public void SoftAssertionLogic() {
		SoftAssert softassert = new SoftAssert();
		System.out.println("This is my first softassert statement logic");   //1st logic
		softassert.assertTrue(true);                                                           //1st soft assertion
		
		int k = 100; int l = 99;
		System.out.println("The subtracted value is :" + (k-l));        //2nd logic
		softassert.assertTrue(false);                                                  //2nd soft assertion/validation
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 != b2);                                        //3rd logic
		softassert.assertEquals(b1, b2, "Not equal");            //3rd soft assertion/validation
		
		softassert.assertAll();
	}

}
