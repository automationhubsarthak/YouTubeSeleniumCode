package browsers;

import org.testng.annotations.DataProvider;

public class Common_DataProvider {
	
	@DataProvider
	public static Object[][] getData(){
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "username";
		data[0][1] = "password";
		data[0][2] = "mozilla";
		
		data[1][0] = "username1";
		data[1][1] = "password1";
		data[1][2] = "chrome";
		
		
		return data;
		
	}

}
