package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Dynamic_All {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
	
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\SELENIUM\\BROWSER DRIVERS\\CommonDrivers\\chromedriver.exe"); driver =
		 * new ChromeDriver(); driver.get("http://paytm.com");
		 * System.out.println(driver.getTitle());
		 * 
		 * System.out.println(
		 * "************************************************************************************"
		 * );
		 * 
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\SELENIUM\\BROWSER DRIVERS\\CommonDrivers\\geckodriver.exe"); driver =
		 * new FirefoxDriver(); driver.get("http://flipkart.com");
		 * System.out.println(driver.getTitle());
		 * 
		 * System.out.println(
		 * "************************************************************************************"
		 * );
		 */
		
		System.setProperty("webdriver.edge.driver", "D:\\SELENIUM\\BROWSER DRIVERS\\CommonDrivers\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get("http://amazon.in");
		System.out.println(driver.getTitle());
		
		System.out.println("************************************************************************************");
		
		System.setProperty("webdriver.ie.driver", "D:\\\\SELENIUM\\\\BROWSER DRIVERS\\\\CommonDrivers\\\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://rediff.com");
        System.out.println(driver.getTitle());
		
		
   
	}

}
