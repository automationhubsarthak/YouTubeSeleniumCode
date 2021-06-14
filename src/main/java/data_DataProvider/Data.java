package data_DataProvider;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class Data {
	
	@DataProvider
	public static Object[][] getData(Method name){       
		System.out.println("Test Case which has the method is :" + name.getName());
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
