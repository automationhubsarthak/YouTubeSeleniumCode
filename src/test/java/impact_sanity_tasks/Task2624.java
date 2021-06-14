package impact_sanity_tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2624 {
	public static WebDriver driver;
	public static SoftAssert softassert;
	public static WebDriverWait wait;
	
	@Test
	public void formsBugCellActionRegressionTest() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://test.impactecs.com");
		driver.findElement(By.name("UserName")).sendKeys("sarthak@impactecs.com");
		driver.findElement(By.name("Password")).sendKeys("Romeo@123#");
		driver.findElement(By.xpath("//div[@id = 'impSignInInfo']/preceding::span[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(), 'FormsBug')]")).click();	
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[text() = 'Cost Objects']")).click();
		Thread.sleep(3000);
		WebElement CostObject = driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[text() = 'FormsBugCellActionRegressionTest']"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id = 'content']/descendant::a[text() = 'FormsBugCellActionRegressionTest']")));
		//wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(CostObject)));
		CostObject.click();
		WebElement testvalue = driver.findElement(By.className("dx-texteditor-input"));
	 System.out.println(testvalue.getText());		
		
	}
	
	


}
