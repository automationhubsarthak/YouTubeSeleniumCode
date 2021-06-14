package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void Test1() {
		System.out.println("This is BeforSuite annotation");
	}
	
	@BeforeTest
	public void Test2() {
		System.out.println("This is BeforeTest annotations");
	}
	@BeforeClass
	public void Test3() {
		System.out.println("This is Before Class annotations");
	}
	@BeforeMethod
	public void Test4() {
		System.out.println("This is Before Method annotations");
	}
	@Test
	
	public void Test5() {
		System.out.println("This is Test annotations");
	}
	@AfterMethod
	
	public void Test6() {
		System.out.println("This is After Method annotations");
	}
	@AfterClass
	public void Test7() {
		System.out.println("This is After Class annotations");
	}
	@AfterTest
	public void Test8() {
		System.out.println("This is After Test annotations");
	}
	@AfterSuite
	public void Test9() {
		System.out.println("This is After Suite annotations");
	}
                     //	@DataProvider
	

}
