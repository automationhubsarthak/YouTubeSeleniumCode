package taditseleniumbatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions_TestNG {
	
	//Selenium - getCurrentUrl, getTitle, getPageSource, isEnabled, isDisplayed, isSelected
	//Assertions - Assert (Hard Assert) and SoftAssert
	
	public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void launchURL() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String ExpectedTitle = driver.getTitle();
		String ActualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Sho0pping";
		if(ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Test Case is PASS");
		}else {
			System.out.println("Test Case is FAIL");
		}
	} 
	
	@Test
	public void signinLink() {
		driver.findElement(By.className("signin")).click();
		System.out.println(driver.getCurrentUrl());
		String ExpectedCurrentURL = driver.getCurrentUrl();
		String ActualCurrentURL = "https://mail.rediff.com/cgi-bin/login.cgi";
		//Assert.assertFalse(ExpectedCurrentURL.equals(ActualCurrentURL),  "I am not sure,Just checking");
		softassert.assertFalse(ExpectedCurrentURL.equals(ActualCurrentURL),  "I am not sure,Just checking");
		System.out.println("Print A");
		softassert.assertEquals(driver.findElement(By.xpath("//span[@class = 'forgotlink']/descendant::u[1]")).isEnabled(), true);
		System.out.println("Print B");
		softassert.assertTrue(1<2);
		System.out.println("Print C");
		softassert.assertEquals("HelloWorld", "HelloWorld");
		System.out.println("Print D");
		
		softassert.assertAll();
	} 
	
	
	
	/*@Test
	public void hardAssert() {
		Assert.assertFalse(1>3);
	}
	
	@Test
	public void hardAssert1() {
		Assert.assertTrue(4>3);
	}
	
	@Test
	public void hardAssert2() {
		Assert.assertNotEquals(true, false);
	}
	
	@Test
	public void hardAssert3() {
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void Assert4() {
		Assert.fail("Deliberately want to fail this Test Case");
	}   */

}
