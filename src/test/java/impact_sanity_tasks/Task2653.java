package impact_sanity_tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2653 {
	public static WebDriver driver;
	public static SoftAssert softassert;
	public static WebDriverWait wait;
	
	
	@Test
	public void contextPassingTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://test.impactecs.com/signin");
		driver.findElement(By.name("UserName")).sendKeys("sarthak@impactecs.com");
		driver.findElement(By.name("Password")).sendKeys("Romeo@123#");
		driver.findElement(By.xpath("//div[@id = 'impSignInInfo']/preceding::span[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'FormsAndScriptsTest')]")).click();	
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::span[contains(text(), 'Cost Objects')]")).click();
		driver.navigate().to("https://test.impactecs.com/FormsAndScriptsTest/CostObject/Show%20Form%20From%20Line%20Item?nav=folders#Process");
		driver.findElement(By.xpath("//button[contains(text(), 'Launch')]")).click();
		
		
	}
}
