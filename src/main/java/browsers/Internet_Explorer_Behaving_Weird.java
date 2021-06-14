package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internet_Explorer_Behaving_Weird {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\SELENIUM\\BROWSER DRIVERS\\CommonDrivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://amazon.in");
	}
}
