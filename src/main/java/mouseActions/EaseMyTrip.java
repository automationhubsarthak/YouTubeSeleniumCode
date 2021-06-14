package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EaseMyTrip {
	public static WebDriver driver;
	

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://easemytrip.com");
		
		
		Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//div[@id = 'myTopnav']/descendant::div[@class = 'user_n_icn_hp']"))).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id = 'myTopnav']/descendant::div[@class = 'user_n_icn_hp']/following::a[2]")));
		
		action.click(driver.findElement(By.xpath("//div[@id = 'myTopnav']/descendant::div[@class = 'user_n_icn_hp']/following::a[2]"))).perform();
		driver.findElement(By.xpath("//input[@id = 'txtEmail']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//div[@id= 'RegValid']/parent::*/descendant::input[2]")).click();
		
		//WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id = 'otptxt']")));
		driver.findElement(By.xpath("//input[@id = 'otptxt']")).sendKeys("221155");
	 
	}

}
