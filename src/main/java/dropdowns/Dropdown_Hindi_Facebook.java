package dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Hindi_Facebook {
public static WebDriver driver;
public static Select select;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();
		
		//Select Class Dropdown
		
		select = new Select(driver.findElement(By.id("day")));
		//what are the 3 methods in Select class to handle dropdown - selectByIndex, SelectByValue, SelectByVisibleText
		select.selectByVisibleText("18");
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Dec");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1984");
		
	
		

	}

}
