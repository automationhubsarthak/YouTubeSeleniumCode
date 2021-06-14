package testnglearning_youtubechannel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider_Basic_Concept {
	
	//one of the ways to do parameterization (validating a single test case with multiple sets of data)
	@Test(dataProvider = "getData")        //Step 2 - linking the test case with the dataProvider. It is the name of the method
	
	public static void AddUser(String username, String browser, int mobilenumber, String emailid) { //no of input parameters = total number of columns
		System.out.println(username + "<------------->" + browser + "<----------->" +  mobilenumber + "<---------->" + emailid );
		
	}
	
	@DataProvider
	public Object[][] getData(){              //Step1 = DataProvider returns a 2 Dimensional Object Array
		Object data[][] = new Object[3][4];
		
		data[0][0] = "NameOfTheUser";
		data[0][1] = "Chrome Browser";
		data[0][2] = 989435345;
		data[0][3] = "seleniumpanda@redifffmail.com";
		
		data[1][0] = "NameOfTheUser1";
		data[1][1] = "Firefox Browser";
		data[1][2] = 989434345;
		data[1][3] = "seleniumpanda1@redifffmail.com";
		
		data[2][0] = "NameOfTheUser2";
		data[2][1] = "ie Browser";
		data[2][2] = 984435345;
		data[2][3] = "seleniumpanda2@redifffmail.com";
		
		return data;	
	} 		
	}

