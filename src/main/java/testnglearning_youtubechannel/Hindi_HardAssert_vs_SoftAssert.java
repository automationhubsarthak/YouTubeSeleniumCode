package testnglearning_youtubechannel;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hindi_HardAssert_vs_SoftAssert {
	
	@Test
	public void HardAssertLogic() {
		System.out.println("this is my first hard assert statement");
		Assert.assertTrue(true);
		
		System.out.println("this is my second hard assert statement");
		Assert.assertTrue(false);
		
		System.out.println("This is my third hard assert statement");
		Assert.assertTrue(true);
	}
	
	@Test
	public void SoftAssertLogic() {
		SoftAssert softassert = new SoftAssert();
		
		System.out.println("this is my first soft assert statement");
		softassert.assertTrue(true);
		
		System.out.println("this is my second soft assert statement");
		softassert.assertTrue(false);
		
		System.out.println("this is my third soft assert statement");
		softassert.assertTrue(true);

		softassert.assertAll();
}
}