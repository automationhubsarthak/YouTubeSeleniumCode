package testnglearning_youtubechannel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependencies_TestCases {

	public static WebDriver driver;
	
	@Test(priority = 1, enabled = true)
	public void URLOpen() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://rediff.com");
	}
	
	@Test(priority = 2, enabled = true, dependsOnMethods = "URLOpen")
	public void gotoLoginPage() {
		driver.findElement(By.className("signin")).click();
	}
	
	@Test(priority = 3, enabled = true, dependsOnMethods = {"URLOpen", "gotoLoginPage"})
	public void LoginPageDataEntry() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
	}
}
