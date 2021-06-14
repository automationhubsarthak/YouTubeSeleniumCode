package taditseleniumbatch;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Difference_Annotations {
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is beforeMethod");
	}
	
	@Test
	public void login() {
		System.out.println("This is login test");
	}
	
	@Test
	public void selectitem() {
		System.out.println("This will select any item");
	}
	
	@Test
	public void addtoCart() {
		System.out.println("This will add item to Cart");
	}
	
	@Test
	public void logout() {
		System.out.println("This is logout test");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("This is after Method");
	}

}

