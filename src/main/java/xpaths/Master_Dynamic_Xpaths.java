package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Master_Dynamic_Xpaths {
	public static WebDriver driver;
	

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	
	driver.findElement(By.xpath("//p[@id = 'signin_info']/child::a[@class = 'signin']")).click();
	driver.findElement(By.xpath("//div[@id = 'div_login_error']/following-sibling::div[@class = 'table']/descendant::div[3]/child::input[@id = 'login1' and @name = 'login']")).sendKeys("seleniumpanda");
	driver.findElement(By.xpath("//img[@id = 'fill_metric']/preceding::input[@id = 'password' and @name = 'passwd']")).sendKeys("Selenium@123");
	driver.findElement(By.xpath("//div[@id = 'div_login_error']/following-sibling::div[@class = 'table']/descendant::input[@class = 'signinbtn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class = 'rd_header']/descendant::a[contains(text(), 'Logout')]")).click();
	
	}

}
