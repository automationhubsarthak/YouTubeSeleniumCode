package taditseleniumbatch2;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	//Annotations - not all are necessary to use
	// a tester can use the annotations available as per his/her technical requirements or specifications
	//Annotations - have a precedence. Some annotations execute before the other annotations
	//Precedence order - @BeforeSuite > @BeforeTest > @BeforeClass > @BeforeMethod >  @Test >   @AfterMethod > @AfterClass >  @AfterTest > @AfterSuite
	/*
	 * Before Method
        This is first test case
        After Method
        
         Before Method
        This is second test case
         After Method
         
          Before Method
          This is third test case
          After Method
	 */
	
	

	
	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("Before Method");
	}

	 @Test
	 public void testCase1() {
		System.out.println("This is first test case"); 
	 }
	 
	 @Test
	 public void testCase2() {
		System.out.println("This is second test case"); 
	 }
	 
	 @Test
	 public void testCase3() {
		System.out.println("This is third test case"); 
	 }
	 
	
		@AfterMethod
		public void afterMethodAnnotation() {
			System.out.println("After Method");
		}
	 
	 
}
