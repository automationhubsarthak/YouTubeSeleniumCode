package testnglearning_youtubechannel;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Paramterization_tngxml {
	public static WebDriver driver;
	
	@Test
	@Parameters({"Browser" , "url", "emailid" ,"password"})
	public void SetUp(String Browser, String url, String emailid, String password) {
		if(Browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		} else if(Browser.equals("Mozilla")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url); //url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys(emailid); //emailid
		driver.findElement(By.id("password")).sendKeys(password); //password
		driver.findElement(By.className("signinbtn")).click();
		
	
		
	}

}
