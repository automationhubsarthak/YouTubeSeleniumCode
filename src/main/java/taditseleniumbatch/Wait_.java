package taditseleniumbatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_ {
public static WebDriver driver;
public static WebDriverWait wait;

public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // this is an example of implicit wait
	
	driver.findElement(By.xpath("//a[@class = 'signin']")).click();
	
	//use WebDriverWait
	driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
	//use WebDriverWait
	driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123");
	//use WebDriverWait
	driver.findElement(By.xpath("//input[@id = 'password']/following-sibling::input[@name = 'proceed' and @class = 'signinbtn']")).click();
	//use WebDriverWait
	driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
	
    wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'main_container']/preceding::b[1]")));
	driver.findElement(By.xpath("//div[@class = 'main_container']/preceding::b[1]")).click();
}
}
