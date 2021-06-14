package testngparametrization;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_TestNG_XML_File {
	
	public static WebDriver driver;
	
	@Test 
	@Parameters({ "browser", "url" , "emailid" , "password"})
	public void RediffLogin(String browser, String url, String emailid, String password) {
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		} else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	
		driver.findElement(By.className("signin")).click();
	
		driver.findElement(By.id("login1")).sendKeys(emailid);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
	}

}
