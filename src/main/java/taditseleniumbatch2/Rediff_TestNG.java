package taditseleniumbatch2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNG {
	
	public static WebDriver driver;
	public static SoftAssert softassert;
	
	
	@BeforeMethod
	public static void landingPage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
	}
	
	@Test
	public static void ValidatingLandingPageOfRediff() {
	
		//.assertTrue, .assertFalse, .assertEquals, .assertNotEquals
		softassert = new SoftAssert();

		WebElement loginlinkdirectattribute = driver.findElement(By.className("signin"));
		WebElement loginlinxpath = driver.findElement(By.xpath("//a[@class = 'signin']"));
		softassert.assertEquals(loginlinkdirectattribute, loginlinxpath, "This is working fine with SoftAssert Class");
		//softassert.assertEquals("I am validating certain Objects", loginlinkdirectattribute, loginlinxpath);
		System.out.println("validating the Objects or the WebElements are supposed to be equal");
		
		softassert.assertFalse(true == false); 
		System.out.println("The above assert statement is true");
		
		
		String A = "Hello";
		String B = "World";
		softassert.assertEquals("This is AssertEquals test", A, B);
		System.out.println("If A is equal to B then this statement will be printed");
		
	softassert.assertTrue(1<2);
	System.out.println("The boolean condition with soft assertion is correct");
	
	softassert.assertAll();
		
		
	}
	
	@Test(enabled = false)
	public static void LoginPageOfRediff() {
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
	}
	
	@AfterMethod
	public static void tearDown() {
		driver.close();
	}
	
 

}
