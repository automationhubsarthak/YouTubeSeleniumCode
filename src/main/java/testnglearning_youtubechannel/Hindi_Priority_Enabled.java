package testnglearning_youtubechannel;
import org.testng.annotations.Test;

public class Hindi_Priority_Enabled {
	//if you do not set priority of test cases, then it will Alphabetical order of method names - it will execute
	//you have to prioritize all the testcases else TestNG will take Alphabetical Order sequence in execution
	
	@Test(priority = 1, enabled = true)
	public void registerUser() {
		System.out.println("User registration");
	}
	
	@Test(priority = 2, enabled = true)
	public void ValidLoginCredentials() {
		System.out.println("Valid login cred");
	}
	
	@Test(priority = 3)
	public void HomePage() {
		System.out.println("Home page visibility");
	}
	
	@Test(priority = 4, enabled = false)
	public void AddBeneficiary() {
		System.out.println("Adding a beneficiary");
	}
	
	@Test(priority = 5, enabled = false)
	public void validatingBeneficiary() {
		System.out.println("Beneficiary validated");
	}
	
	@Test(priority = 6)
	public void LogOut() {
		System.out.println("User logs out");
	}

}
