package browser_options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox_Options_Demo {
	public static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		
		//Profiling in Firefox
		//Notifications
		//Certificates (Trust issues)
		//PageLoadStrategy
		//Proxy Servers

		
		
		
		
		driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
	}

}
