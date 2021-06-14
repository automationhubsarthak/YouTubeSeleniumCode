package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static WebDriver driver;
	public static void main(String[] args) {
	     //WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\BROWSER DRIVERS\\CommonDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();

	}

}
