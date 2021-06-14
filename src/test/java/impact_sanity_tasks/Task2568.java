package impact_sanity_tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2568 {
	public static WebDriver driver;
	public static SoftAssert softassert;
	public static WebDriverWait wait;
	
	@Test
	public void editAndNavigateAway() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://test.impactecs.com");
		driver.findElement(By.name("UserName")).sendKeys("sarthak@impactecs.com");
		driver.findElement(By.name("Password")).sendKeys("Romeo@123#");
		driver.findElement(By.xpath("//div[@id = 'impSignInInfo']/preceding::span[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'FormsAndScriptsTest')]")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id = 'contentContainer']/preceding::span[contains(text(), 'Script Modules')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class = 'wj-marquee']/preceding::a[contains(text(), 'SetUserInfo')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id = 'topBarDivButtons']/descendant::span[contains(text(), 'Execute')]")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("div[@id = 'impactConfirmDialog']/preceding::button[2]")));
		driver.findElement(By.xpath("//div[@id = 'impactConfirmDialog']/preceding::button[2]")).click();

}
}