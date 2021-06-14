import java.io.FileInputStream;
import java.util.Properties;


public class Read_From_Properties {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fip = new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\SELENIUM_WEBDRIVER_CODE\\Config.properties");
		
		Properties prop = new Properties();
		prop.load(fip);
		
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		
		
		System.out.println(url + " ------------" + username + " ------------------" + password);

	}

}
