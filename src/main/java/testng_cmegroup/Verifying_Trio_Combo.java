package testng_cmegroup;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Verifying_Trio_Combo {
	
	@BeforeMethod
    public void beforeMethod(){
        System.out.println("This is Before Method annotation");
    } 
	
	 @Test 
	    public void testcasenumber1(){
	        System.out.println("This is a Test case number 1");
	    } 
	    
	    @Test
	    public void testcasenumber2() {
	    	System.out.println("This is test case number 2");
	    }
	    
	    @Test
	    public void testcasenumber3() {
	    	System.out.println("This is test case number 3");
	    }
	    
	    @Test
	    public void testcasenumber4() {
	    	System.out.println("This is test case number 4");
	    }
	    
	    @AfterMethod
	    public void afterMethod(){
	        System.out.println("This is After Method annotation");
	    } 


}
