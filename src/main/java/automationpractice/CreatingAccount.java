package automationpractice;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingAccount {
	
	public static WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		
		driver = new ChromeDriver(options);
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@Test
	
	public void createaccount() throws Exception  {
		
		
		driver.findElement(By.xpath("//a[@class ='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("automationhubsarthak1234@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.xpath("//input[@id = 'customer_firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id = 'customer_lastname']")).sendKeys("Sarthak");
		driver.findElement(By.xpath("//input[@id = 'passwd']")).sendKeys("Test12");
		
		
		Select select = new Select(driver.findElement(By.id("days")));
		select.selectByVisibleText("10");
		
		Select select1 = new Select(driver.findElement(By.id("months")));
		select1.selectByVisibleText("December");
		
		Select select2 = new Select(driver.findElement(By.id("years")));
		select2.selectByVisibleText("1984");
		
		driver.findElement(By.xpath("//input[@id = 'address1']")).sendKeys("5700 South Mopac");
		driver.findElement(By.id("city")).sendKeys("Austin");
		
		Select select3 = new Select(driver.findElement(By.id("id_state")));
		select3.selectByVisibleText("Texas");
		
		driver.findElement(By.id("postcode")).sendKeys("78749");
		driver.findElement(By.id("phone_mobile")).sendKeys("");
		driver.findElement(By.id("alias")).sendKeys("2005,S.Mopac, Austin Texas,78749");

		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
