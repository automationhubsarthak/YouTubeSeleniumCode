package browsers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {
	
	@Test(dataProvider = "getData")                 //link this testcase to the dataprovider [step 2]
	public void Login(String username, String password, String browser, String result) {     // number of input parameters inside the function 	 = number of parameters in the test case
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] obj = new Object[3][4];          //make 2 dimensional object array and fill in the data [step 1]
		obj[0][0] = "username";
		obj[0][1] = "password";
		obj[0][2] = "mozilla";
		obj[0][3] = true;
		
		obj[1][0] = "username1";
		obj[1][1] = "password1";
		obj[1][2] = "chrome";
		obj[1][3] = true;
		
		obj[2][0] = "username2";
		obj[2][1] = "password2";
		obj[2][2] = "microsoft edge";
		obj[2][3] = true;
		
		
		return obj;
		
	}

}
