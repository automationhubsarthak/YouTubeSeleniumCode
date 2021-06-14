package data_handling;

import java.io.FileInputStream;
import java.util.Properties;

public class Reading_Properties_File {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "\\Learning.properties";
        FileInputStream ip = new FileInputStream(path);
		prop.load(ip);

		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("url"));

	}

}
