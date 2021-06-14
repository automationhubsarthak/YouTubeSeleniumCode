package impact_sanity_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2558 {
	
	public static WebDriver driver;
	public static SoftAssert softassert;
	public static WebDriverWait wait;
	
	@Test
	public void descriptionPresentAndNoneTest() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://test.impactecs.com");
		driver.findElement(By.name("UserName")).sendKeys("sarthak@impactecs.com");
		driver.findElement(By.name("Password")).sendKeys("Romeo@123#");
		driver.findElement(By.xpath("//div[@id = 'impSignInInfo']/preceding::span[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'NavigationTests')]")).click();	
		
		//Calculations
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionPresent')]")).click();
				WebElement descriptionText = driver.findElement(By.id("itemDescription"));
				softassert.assertTrue(descriptionText.isDisplayed());
				driver.navigate().back();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionNone')]")).click();
				softassert.assertFalse(descriptionText.isDisplayed());
			
		//CostObject
				driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Cost Objects')]")).click();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionPresent')]")).click();
				softassert.assertTrue(descriptionText.isDisplayed());
				driver.navigate().back();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionNone')]")).click();
				softassert.assertFalse(descriptionText.isDisplayed());
				
		//Forms
				driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Forms')]")).click();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionPresent')]")).click();
				softassert.assertTrue(descriptionText.isDisplayed());
				driver.navigate().back();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionNone')]")).click();
				softassert.assertFalse(descriptionText.isDisplayed());
		
		//Global Factors
				driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Global Factors')]")).click();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionPresent')]")).click();
				softassert.assertTrue(descriptionText.isDisplayed());
				driver.navigate().back();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionNone')]")).click();
				softassert.assertFalse(descriptionText.isDisplayed());
				
		//Labels
				driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Labels')]")).click();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionPresent')]")).click();
				softassert.assertTrue(descriptionText.isDisplayed());
				driver.navigate().back();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionNone')]")).click();
				softassert.assertFalse(descriptionText.isDisplayed());
				
		//Processes
				driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Processes')]")).click();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionPresent')]")).click();
				softassert.assertTrue(descriptionText.isDisplayed());
				driver.navigate().back();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionNone')]")).click();
				softassert.assertFalse(descriptionText.isDisplayed());
				
		//Queries
				driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Queries')]")).click();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionPresent')]")).click();
				softassert.assertTrue(descriptionText.isDisplayed());
				driver.navigate().back();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionNone')]")).click();
				softassert.assertFalse(descriptionText.isDisplayed());
				
		//Script Modules
				driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Script Modules')]")).click();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionPresent')]")).click();
				softassert.assertTrue(descriptionText.isDisplayed());
				driver.navigate().back();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionNone')]")).click();
				softassert.assertFalse(descriptionText.isDisplayed());
				
		//Tables
				driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Tables')]")).click();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionPresent')]")).click();
				softassert.assertTrue(descriptionText.isDisplayed());
				driver.navigate().back();
				driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemDescriptionNone')]")).click();
				softassert.assertFalse(descriptionText.isDisplayed());
				
				softassert.assertAll();

}
	
}
