package taditseleniumbatch;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Concepts {
	public static WebDriver driver;
	
	@BeforeMethod
	public void bm() {
		System.out.println("This is before method");
	}
	
	@Test(priority = 1, enabled = true)
	public void launchUrl() {
		System.out.println("This will launch the URL");
	}
	
	@Test(priority = 2, enabled = true, dependsOnMethods = "launchUrl", invocationCount = 1, alwaysRun = true)
	public void loginCredentials() {
		System.out.println("This will enter the login credentials");
	}
	
	@Test(priority = 3, enabled = true, dependsOnMethods = {"launchUrl", "loginCredentials"})
	public void homepageValidation() {
		System.out.println("This will validate the home page");
	}
	
@Test(priority = 4, enabled = true, dependsOnMethods = {"launchUrl", "loginCredentials", "homepageValidation"})
public void logOut() {
	System.out.println("This will logout from the application");
}

@AfterMethod
public void am() {
	System.out.println("This is after method");
}
}
