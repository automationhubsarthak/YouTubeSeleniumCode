package xpathinHindi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Flow_Dynamic_Xpath {
	
	public static WebDriver driver;
	
   public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.xpath("//p[@id = 'signin_info']/descendant::a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//img[@id = 'fill_metric']/preceding::div[1]/parent::*/preceding::input[@id = 'login1' and @name = 'login']")).sendKeys("seleniumpanda");
		driver.findElement(By.xpath("//div[@id = 'div_login_error']/following-sibling::div[contains(@class, 'table')]/child::div[2]/descendant::input[@id = 'password' and @name = 'passwd']")).sendKeys("Selenium@123");
		
		driver.findElement(By.xpath("//div[@class = 'left_in']/preceding::img[@id = 'fill_metric']/preceding::input[contains(@class , 'signinbtn')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
		
		

	}

}
