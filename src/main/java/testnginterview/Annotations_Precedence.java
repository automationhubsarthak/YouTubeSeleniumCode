package testnginterview;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Annotations_Precedence {

	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is the before suite annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is the before class annotatioan");
	}

}
