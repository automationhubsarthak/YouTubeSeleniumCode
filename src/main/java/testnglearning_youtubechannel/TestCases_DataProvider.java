package testnglearning_youtubechannel;

import org.testng.annotations.Test;

import data_DataProvider.Data;

public class TestCases_DataProvider {
	
	@Test(dataProviderClass = Data.class, dataProvider = "getData")
	public void AddUser(String username, String browser, int mobile, String email) {
		System.out.println(username + "-------" + browser + "-------" + mobile + "--------" + email);
	}
	
	@Test(dataProviderClass = Data.class, dataProvider = "getData")
	public void RegisterUser(String username, String browser, int mobile, String email) {
		System.out.println(username + "-------" + browser + "-------" + mobile + "--------" + email);	
	}
	
	@Test(dataProviderClass = Data.class, dataProvider = "getData")
	public void DeleteUser(String username, String browser, int mobile, String email){
		System.out.println(username + "-------" + browser + "-------" + mobile + "--------" + email);	
	}

}
