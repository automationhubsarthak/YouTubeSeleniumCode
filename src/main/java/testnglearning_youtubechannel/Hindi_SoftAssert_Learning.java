package testnglearning_youtubechannel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hindi_SoftAssert_Learning {
	//Step 1 - You have to create an object of SoftAssert class
	//Step 2 - at the end of the test case, when all your logic is completed, invoke the method assertAll();
	
	@Test
	public void Validation() {
		SoftAssert softassert = new SoftAssert(); //object creation
		
		int i = 20; int j = 25;
		System.out.println("Sum is :" + (i+j));   //logic
		softassert.assertTrue(true);        //soft assertion / validation
		
		boolean b1 = 1<2;     //true
		boolean b2 = 2 >3 ;      //false
		softassert.assertEquals(b2, b1, "b2 is a wrong statement");
		
		
		
		softassert.assertAll(); //importance - this will give all the exceptions within the test case and it should be the last statement inside a test case. 
	}

}
