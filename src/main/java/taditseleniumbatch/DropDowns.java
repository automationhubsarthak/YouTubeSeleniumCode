package taditseleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {
public static WebDriver driver;
public static Select select;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		driver.findElement(By.cssSelector("form._featuredLogin__formContainer > div:nth-of-type(5) > a")).click();

		//dropdown with Select class
		//Step1 - you have to create the object of the Select class
		//Step 2 - you have to pass the parameter of locator inside the Object body
		//do not go for selectByIndex and do not go for selectByValue
		
		Thread.sleep(3000);
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("10");
	
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Apr");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1994");
	}

}
