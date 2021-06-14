package taditseleniumbatch;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNg_annotations {
	public static WebDriver driver;
	
	
	@Test(priority = 1)
	public void openURL() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 2)
	public void loginPage() {
    driver.findElement(By.className("signin")).click();
	}
	
	@Test(priority = 3)
	public void loginCredentials() {
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		//driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("signinbtn")).click();
	}
	
	@Test(priority = 4)
	public void tearDown() {
		driver.quit();
	}

}
