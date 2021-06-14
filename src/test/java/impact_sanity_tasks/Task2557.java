package impact_sanity_tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2557 {

	public static WebDriver driver;
	public static SoftAssert softassert;
	public static WebDriverWait wait;
	
	@Test
	public void itemIconExternalFontAwesomeNoneTest() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://test.impactecs.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.name("UserName")).sendKeys("sarthak@impactecs.com");
		driver.findElement(By.name("Password")).sendKeys("Romeo@123#");
		driver.findElement(By.xpath("//div[@id = 'impSignInInfo']/preceding::span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(), 'NavigationTests')]")).click();	
		
		//Calculations
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconExternal')]")).click();
		WebElement externalImage = driver.findElement(By.id("itemImage"));
		softassert.assertTrue(externalImage.isEnabled());
		softassert.assertTrue(externalImage.isDisplayed());
		externalImage.click();
		WebElement validateExternalImage = driver.findElement(By.xpath("//body/child::img[1]"));
		softassert.assertTrue(validateExternalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Calculations')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconFontAwesome')]")).click();
		softassert.assertTrue(externalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconNone')]")).click();
		softassert.assertFalse(externalImage.isDisplayed());
		
		//Cost Objects
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Cost Objects')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconExternal')]")).click();
		softassert.assertTrue(externalImage.isEnabled());
		softassert.assertTrue(externalImage.isDisplayed());
		externalImage.click();
		softassert.assertTrue(validateExternalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Cost Objects')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconFontAwesome')]")).click();
		softassert.assertTrue(externalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconNone')]")).click();
		softassert.assertFalse(externalImage.isDisplayed());
		
		//Forms
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Forms')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconExternal')]")).click();
		softassert.assertTrue(externalImage.isEnabled());
		softassert.assertTrue(externalImage.isDisplayed());
		externalImage.click();
		softassert.assertTrue(validateExternalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Forms')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconFontAwesome')]")).click();
		softassert.assertTrue(externalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconNone')]")).click();
		softassert.assertFalse(externalImage.isDisplayed());
		
		//Global Factors
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Global Factors')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconExternal')]")).click();
		softassert.assertTrue(externalImage.isEnabled());
		softassert.assertTrue(externalImage.isDisplayed());
		externalImage.click();
		softassert.assertTrue(validateExternalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Global Factors')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconFontAwesome')]")).click();
		softassert.assertTrue(externalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconNone')]")).click();
		softassert.assertFalse(externalImage.isDisplayed());
		
		//Labels
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Labels')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconExternal')]")).click();
		softassert.assertTrue(externalImage.isEnabled());
		softassert.assertTrue(externalImage.isDisplayed());
		externalImage.click();
		softassert.assertTrue(validateExternalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Labels')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconFontAwesome')]")).click();
		softassert.assertTrue(externalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconNone')]")).click();
		softassert.assertFalse(externalImage.isDisplayed());
		
		//Processes
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Processes')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconExternal')]")).click();
		softassert.assertTrue(externalImage.isEnabled());
		softassert.assertTrue(externalImage.isDisplayed());
		externalImage.click();
		softassert.assertTrue(validateExternalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Processes')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconFontAwesome')]")).click();
		softassert.assertTrue(externalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconNone')]")).click();
		softassert.assertFalse(externalImage.isDisplayed());
		
		//Queries
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Queries')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconExternal')]")).click();
		softassert.assertTrue(externalImage.isEnabled());
		softassert.assertTrue(externalImage.isDisplayed());
		externalImage.click();
		softassert.assertTrue(validateExternalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Queries')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconFontAwesome')]")).click();
		softassert.assertTrue(externalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconNone')]")).click();
		softassert.assertFalse(externalImage.isDisplayed());
		
		//Script Modules
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Script Modules')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconExternal')]")).click();
		softassert.assertTrue(externalImage.isEnabled());
		softassert.assertTrue(externalImage.isDisplayed());
		externalImage.click();
		softassert.assertTrue(validateExternalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Script Modules')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconFontAwesome')]")).click();
		softassert.assertTrue(externalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconNone')]")).click();
		softassert.assertFalse(externalImage.isDisplayed());
		
		//Tables
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Tables')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconExternal')]")).click();
		softassert.assertTrue(externalImage.isEnabled());
		softassert.assertTrue(externalImage.isDisplayed());
		externalImage.click();
		softassert.assertTrue(validateExternalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Tables')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconFontAwesome')]")).click();
		softassert.assertTrue(externalImage.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemIconNone')]")).click();
		softassert.assertFalse(externalImage.isDisplayed());
		
		softassert.assertAll();
		
	}
}
