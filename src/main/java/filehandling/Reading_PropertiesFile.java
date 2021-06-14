package filehandling;

import java.io.FileInputStream;
import java.util.Properties;

public class Reading_PropertiesFile {

	public static void main(String[] args) throws Exception {

		 System.out.println(System.getProperty("user.dir"));
		//Create the object of the Properties Class
		Properties prop = new Properties();
		String path = System.getProperty("user.dir") +  "\\src\\main\\java\\filehandling\\redifflogin.properties";
		//Create the Object of FileInputStream Class
		FileInputStream ip = new FileInputStream(path);
		//from the FileInputStream object we are loading everything into the Properties Object
		prop.load(ip);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("url"));
		
		

	}

}
