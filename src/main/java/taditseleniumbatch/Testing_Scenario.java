package taditseleniumbatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing_Scenario {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 
		driver.findElement(By.className("signin")).click();
	   driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	   driver.findElement(By.id("password")).sendKeys("Selenium@123");
	   driver.findElement(By.className("signinbtn")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.className("rd_logout")).click();
	   

	}

}
