package testng;

import org.testng.annotations.Test;

public class Hindi_Groups {
	
	//Groups - UnitTest, SmokeTest, SanityTest, UATTest, RegressionTest
	
	@Test(priority = 1, groups = "smoketest")
	public void EnterURL() {
		System.out.println("This is the url entry into any browser");
	}
	
	@Test(priority = 2, groups = {"smoketest", "sanitytest"})
	public void LandingPage() {
		System.out.println("This is LandingPage test");
	}
	
	@Test(priority = 3, dependsOnMethods = {"EnterURL", "LandingPage"}, dependsOnGroups = "smoketest")
	public void RegisterUser() {
		System.out.println("This isRegisterUser test");
	}
	
	@Test(priority = 4)
	public void UserLogin() {
		System.out.println("This is user login test");
	}
	
	@Test(priority = 5)
	public void LogOut() {
		System.out.println("This is logout test");
	}
	
	

}
