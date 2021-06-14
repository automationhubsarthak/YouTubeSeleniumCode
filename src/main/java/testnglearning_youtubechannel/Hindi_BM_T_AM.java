package testnglearning_youtubechannel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hindi_BM_T_AM {
	
	//@BeforeMethod <-> @Test <-> @AfterMethod ==> this is a combination
	
	@BeforeMethod
	public void UserRegistration() {
		System.out.println("User is getting registered");
	}
	
	@Test
	public void UserLogin() {
		System.out.println("User is able to login");
	}
	
	@Test
	public void UserMoneyControl() {
		System.out.println("User is able to transfer funds to another account");
	}
	
	@AfterMethod
	public void UserLogOut() {
		System.out.println("User is able to logout");
	}

}
