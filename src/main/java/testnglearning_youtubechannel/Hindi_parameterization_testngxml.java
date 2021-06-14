package testnglearning_youtubechannel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hindi_parameterization_testngxml {
	public static WebDriver driver;
	
	@Test
	@Parameters({"Browser", "url", "emailid" , "password"})
	public void Rediff(String Browser, String url, String emailid, String password) {
		if(Browser.equals("Chrome")) {     //Browser is an input parameter
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}else if (Browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url); //url is an input parameter
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys(emailid); //emailid is an input parameter
		driver.findElement(By.id("password")).sendKeys(password);  //password is an input parameter
		driver.findElement(By.className("signinbtn")).click();
		
	}

}
