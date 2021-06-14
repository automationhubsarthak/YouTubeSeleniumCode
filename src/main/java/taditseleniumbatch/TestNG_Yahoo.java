package taditseleniumbatch;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Yahoo {
	public static WebDriver driver;
	@Test
	@Parameters({"BrowserY","urlY","usernameY","passwordY"})
	public void testingYahoo (String BrowserY,String urlY,String usernameY,String passwordY)throws Exception{
	 if (BrowserY.equals("chrome")) {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	 }else if(BrowserY.equals("Firefox")) {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	 }
	driver.manage().window().maximize();
	driver.get(urlY);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@class='fuji-button-link fuji-button-text fuji-button-inverted']")).click();
	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(usernameY);
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	driver.findElement(By.className("password")).sendKeys(passwordY);
	driver.findElement(By.id("login-signin")).click();
	driver.quit();
	 
	}
	}