package testnglearning_youtubechannel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hindi_DataProvider {
	//parameterization = test case (username + password) [u1/p1 , u2,/p2 , u3/p3,,,,,,Un/Pn]

	@Test(dataProvider = "getData") //3rd step - dataProvider has to be mentioned with the name of the method inside the DataProvider annotation
	public void DataMatrix(String username, String password, int mobile, String Browser) { //4th step - no of input parameters inside the method = number of cols in the DataProvider OA
		
	}
	
	@DataProvider
	
	//1st step - returns a 2 dimensional Object Array
	//2nd step - rows and cols - you have to specify
	 public Object[][] getData(){
		Object[][] data = new Object[3][4]; //[rows][cols]
		
		data[0][0] = "Username";
		data[0][1] = "Password";
		data[0][2] = 9878674;
		data[0][3] = "Mozilla";
		
		data[1][0] = "Username1";
		data[1][1] = "Password1";
		data[1][2] = 9878675;
		data[1][3] = "Chrome";
		
		data[2][0] = "Username2";
		data[2][1] = "Password2";
		data[2][2] = 9878678;
		data[2][3] = "Safari";
		
		return data;
		
	}
}
