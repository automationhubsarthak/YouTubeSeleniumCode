package taditseleniumbatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_XpathAssignment {
	public static WebDriver driver;
	
public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rediff.com/"); //entering url is an input parameter
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com"); //username
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123"); //password
		driver.findElement(By.xpath("//input[@id = 'password']/following-sibling::input[@name = 'proceed' and @class = 'signinbtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class = 'main_container']/preceding::b[1]")).click();

	}

}
