package testnglearning_youtubechannel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hindi_Dependencies {
	public static WebDriver driver;
	
	@BeforeTest
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mycarhelpline.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1, enabled = true)
	public void LandingPage() {
		System.out.println(driver.getCurrentUrl());
		String CurrentURL = "https://www.mycarhelpline.com/";
		
		if(CurrentURL.equals("https://www.mycarhelpline.com/")) {
			System.out.println("Test Case LandingPage is PASS");
		} else {
			System.out.println("TestCase LandingPage is FAIL");
		}
		Assert.fail("Deliberately Failing");
	}
	
	@Test(priority = 2, enabled = true, dependsOnMethods = "LandingPage" )
	public void 	Calculator() {
		driver.findElement(By.linkText("Calculator")).click();
	}
	
	@Test(priority = 3, enabled = true, dependsOnMethods = {"LandingPage", "Calculator"} )
	public void ReturntoHomePage() {
		driver.findElement(By.linkText("Home")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
