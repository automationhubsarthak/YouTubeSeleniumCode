package impact_sanity_tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2604 {
	public static WebDriver driver;
	public static SoftAssert softassert;
	public static WebDriverWait wait;
	
	@Test
	public void editAndNavigateAway() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://test.impactecs.com");
		driver.findElement(By.name("UserName")).sendKeys("sarthak@impactecs.com");
		driver.findElement(By.name("Password")).sendKeys("Romeo@123#");
		driver.findElement(By.xpath("//div[@id = 'impSignInInfo']/preceding::span[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'NavigationTests')]")).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionPresent')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id = 'lightbox']/following-sibling::div[3]/child::div[3]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.wj-cell.wj-state-selected.wj-state-active")));
		driver.findElement(By.cssSelector("div.wj-cell.wj-state-selected.wj-state-active")).sendKeys("Testing");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.wj-grid-editor.wj-form-control")).click();
	
		
	
		
	
	

	}

}
