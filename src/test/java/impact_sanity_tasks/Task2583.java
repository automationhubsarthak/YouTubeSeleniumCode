package impact_sanity_tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2583 {
	public static WebDriver driver;
	public static SoftAssert softassert;

	@Test
	public void task2583() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://test.impactecs.com");
		driver.findElement(By.name("UserName")).sendKeys("sarthak@impactecs.com");
		driver.findElement(By.name("Password")).sendKeys("Romeo@123#");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id = 'impSignInInfo']/preceding::span[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'NavigationTests')]")).click();		
		driver.navigate().to("https://test.impactecs.com/Demo2/Folder?nav=folders&folder=1&itemType=1&display=Calculations");		
		driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::div[2]")).click();
		String validation = driver.findElement(By.xpath("//div[@id = 'navigationView']/descendant::div[2]")).getAttribute("aria-expanded");
		System.out.println(validation);
		
		if(validation.contains("false")) {
			softassert.assertTrue(true, "Calculations is not expanded");
		}
		else {
			softassert.assertTrue(false, "Calculations is expanded");
		}
	softassert.assertAll();

	}

}
