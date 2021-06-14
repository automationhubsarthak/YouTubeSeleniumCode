package testngparametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//parameterization - executing one test with multiple sets of data

public class Login {
	
	@Test(dataProvider = "getData")
	//number of input parameters inside the function should be = no of parameters in the test case
	public void logintest(String username, String password, String ExpectedResult, String browser) {
		
	}
	
	//returns a 2 Dimensional Object Array
	@DataProvider
	public Object[][]  getData(){
		
		Object data[][] = new Object[3][4];
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = "Pass";
		data[0][3] = "Chrome";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = "Pass";
		data[1][3] = "IE";
		
		data[2][0] = "username3";	
		data[2][1] = "password3";
		data[2][2] = "Pass";
		data[2][3] = "Mozilla";
		
		return data;
		
	}

}
