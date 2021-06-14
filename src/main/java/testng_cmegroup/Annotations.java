package testng_cmegroup;

import org.testng.annotations.*;

public class Annotations {
	 @BeforeSuite
	    public void beforeSuite(){
	        System.out.println("This is Before Suite annotation");
	    }

	    @BeforeTest
	    public void beforeTest(){
	        System.out.println("This is Before Test annotation");
	    }

	    @BeforeClass
	    public void beforeClass(){
	        System.out.println("This is Before Class annotation");
	    }

	    @BeforeMethod
	    public void beforeMethod(){
	        System.out.println("This is Before Method annotation");
	    }

	    @Test //it is a TestCase. And it is the most important annotation among all these. Without @Test, execution cannot happen
	    public void testcase(){
	        System.out.println("This is a Test Case");
	    } 
	    
	    @Test
	    public void testcasenumber2() {
	    	System.out.println("This is test case number 2");
	    }

	    @AfterMethod
	    public void afterMethod(){
	        System.out.println("This is After Method annotation");
	    }

	    @AfterClass
	    public void afterClass(){
	        System.out.println("This is After Class annotation");
	    }

	    @AfterTest
	    public void afterTest(){
	        System.out.println("This is After Test annotation");
	    }

	    @AfterSuite
	    public void afterSuite(){
	        System.out.println("This is After Suite annotation");
	    }

}
