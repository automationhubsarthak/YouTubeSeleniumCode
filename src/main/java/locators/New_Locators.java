package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Locators {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//ByIdOrName - either id or name should be present for the element which you want to locate
		driver.findElement(new ByIdOrName("login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		//ByAll - you can use the attributes but make sure that the values we enter are correct 
		driver.findElement(new ByAll(By.id("password"), By.name("passwd"))).sendKeys("Selenium@123");
		
		//ByChained - follows kind of heirarchy - better to use Xpaths
		driver.findElement(new ByChained(By.xpath("//input[@id = 'login1']/following::div[1]/child::div[2]"), 
				By.xpath("//input[@id = 'login1']/following::div[1]/child::div[2]/child::input[@name = 'proceed']"))).click();

	}

}
