package taditseleniumbatch;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concept {

	@Test(dataProvider = "getData" ) //pass the dataprovider with the name of the ObjectArray
	public void dataparameterization(String username, String Browser, int mobilenumber, String emailID, char initials) { //number of input parameters = number of columns of the Object Array
		System.out.println(username + "<------------->" + Browser + "<----------->" +  mobilenumber + "<---------->" + emailID  + "<-----------> " + initials);
}
	
	@DataProvider         //it returns a 2 Dimensional Object Array
	public Object[][] getData(){              
		Object data[][] = new Object[4][5];  //rows and columns you have to fill in all the Data
		
		data[0][0] = "Saima";
		data[0][1] = "Chrome Browser";
		data[0][2] = 989435345;
		data[0][3] = "seleniumpanda@redifffmail.com";
		data[0][4] = 's';
		
		data[1][0] = "Rabia";
		data[1][1] = "Firefox Browser";
		data[1][2] = 989434345;
		data[1][3] = "seleniumpanda1@redifffmail.com";
		data[1][4] = 'r';
		
		data[2][0] = "Chikwe";
		data[2][1] = "ie Browser";
		data[2][2] = 984435345;
		data[2][3] = "seleniumpanda2@redifffmail.com";
		data[2][4] = 'c';
		
		data[3][0] = "Noman";
		data[3][1] = "Edge Browser";
		data[3][2] = 984435345;
		data[3][3] = "seleniumpanda3@redifffmail.com";
		data[3][4] = 'n';
		
		return data;
}
	
}
