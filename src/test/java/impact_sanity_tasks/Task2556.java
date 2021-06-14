package impact_sanity_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task2556 {
	
	public static WebDriver driver;
	public static SoftAssert softassert;
	public static WebDriverWait wait;
	
	@Test
	public void ItemTitleDifferentNoneWhiteSpaceTest() {
		
		//Calculations
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleDifferent')]")).click();
		WebElement diffTitleVisibility = driver.findElement(By.xpath("//span[@id = 'itemName'][contains(text(), 'Different Title')]"));
		softassert.assertTrue(diffTitleVisibility.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleNone')]")).click();
		WebElement titleNone = driver.findElement(By.xpath("//span[@id = 'itemName'][contains(text(), 'ItemTitleNone')]"));
		softassert.assertTrue(titleNone.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleWHiteSpace')]")).click();
		WebElement titleWhiteSpace = driver.findElement(By.xpath("//span[@id = 'itemName'][contains(text(), 'ItemTitleWhiteSpace')]"));
		softassert.assertTrue(titleWhiteSpace.isDisplayed());
		
		//CostObjects
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Cost Objects')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleDifferent')]")).click();
		softassert.assertTrue(diffTitleVisibility.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Cost Objects')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleNone')]")).click();
		softassert.assertTrue(titleNone.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Cost Objects')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleWHiteSpace')]")).click();
		softassert.assertTrue(titleWhiteSpace.isDisplayed());
		
		//Forms
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Forms')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleDifferent')]")).click();
		softassert.assertTrue(diffTitleVisibility.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Forms')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleNone')]")).click();
		softassert.assertTrue(titleNone.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Forms')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleWHiteSpace')]")).click();
		softassert.assertTrue(titleWhiteSpace.isDisplayed());
		
		//Global Factors
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Global Factors')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleDifferent')]")).click();
		softassert.assertTrue(diffTitleVisibility.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Global Factors')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleNone')]")).click();
		softassert.assertTrue(titleNone.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Global Factors')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleWHiteSpace')]")).click();
		softassert.assertTrue(titleWhiteSpace.isDisplayed());
		
		//Labels
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Labels')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleDifferent')]")).click();
		softassert.assertTrue(diffTitleVisibility.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Labels')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleNone')]")).click();
		softassert.assertTrue(titleNone.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Labels')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleWHiteSpace')]")).click();
		softassert.assertTrue(titleWhiteSpace.isDisplayed());
		
		//Processes
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Processes')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleDifferent')]")).click();
		softassert.assertTrue(diffTitleVisibility.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Processes')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleNone')]")).click();
		softassert.assertTrue(titleNone.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Processes')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleWHiteSpace')]")).click();
		softassert.assertTrue(titleWhiteSpace.isDisplayed());
		
		//Queries
		
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Queries')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleDifferent')]")).click();
		softassert.assertTrue(diffTitleVisibility.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Queries')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleNone')]")).click();
		softassert.assertTrue(titleNone.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Queries')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleWHiteSpace')]")).click();
		softassert.assertTrue(titleWhiteSpace.isDisplayed());
		
		//Script Modules
		
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Script Modules')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleDifferent')]")).click();
		softassert.assertTrue(diffTitleVisibility.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Script Modules')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleNone')]")).click();
		softassert.assertTrue(titleNone.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Script Modules')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleWHiteSpace')]")).click();
		softassert.assertTrue(titleWhiteSpace.isDisplayed());
		
		//Tables
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Tables')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleDifferent')]")).click();
		softassert.assertTrue(diffTitleVisibility.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Tables')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleNone')]")).click();
		softassert.assertTrue(titleNone.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Tables')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[contains(text(), 'ItemTitleWHiteSpace')]")).click();
		softassert.assertTrue(titleWhiteSpace.isDisplayed());
		
		softassert.assertAll();
		
	}

}
