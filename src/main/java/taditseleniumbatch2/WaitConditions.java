package taditseleniumbatch2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConditions {
	
	public static WebDriver driver;
	public static WebDriverWait wait ;
	
	public static void main(String[] args) throws Exception {
		// there are 2 kinds of waits in Selenium - implicit wait, explicit wait
 WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.rediff.com/");
 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //this is an example of implicit wait
  //this is an example of explicit wait. It will make Selenium to wait for the amount of time prescribed
 //WebDriverWait

 wait = new WebDriverWait(driver, 10);
 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("signin"))));
 driver.findElement(By.className("signin")).click();

 wait = new WebDriverWait(driver, 10);
 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("login1"))));
 driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
 
 wait = new WebDriverWait(driver, 10);
 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("password"))));
 driver.findElement(By.id("password")).sendKeys("Selenium@123");
 
 wait = new WebDriverWait(driver, 10);
 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("signinbtn"))));
 driver.findElement(By.className("signinbtn")).click();
 
 //driver.quit();
	}

}
