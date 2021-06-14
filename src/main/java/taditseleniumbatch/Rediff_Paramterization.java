package taditseleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Paramterization {
	public static WebDriver driver;
	
	 @Test
	 @Parameters({"Browser", "url" , "username", "password"})
	  public void testing(String Browser, String url, String username, String password) throws Exception {
		 if(Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		 }else if(Browser.equals("Firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
			driver.manage().window().maximize();
			driver.get(url); //entering url is an input parameter
			driver.findElement(By.xpath("//a[@class = 'signin']")).click();
			driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys(username); 
			driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password); 
			driver.findElement(By.xpath("//input[@id = 'password']/following-sibling::input[@name = 'proceed' and @class = 'signinbtn']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class = 'main_container']/preceding::b[1]")).click();
	}
}