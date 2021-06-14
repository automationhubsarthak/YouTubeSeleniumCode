package excelsheet;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.rediff.com/");
		 	}
	
	
	 @DataProvider 
	  public Object[][] getLoginData() throws Exception{ 
		 Object data [][] = TestUtil.getTestData("Sheet1"); //sheetname 
		 return data;
	  }
	 
	
	@Test(dataProvider = "getLoginData")
	public void RediffSignin(String user, String pwd) throws Exception {
 wait = new WebDriverWait(driver, 10);
	
	driver.findElement(By.className("signin")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.id("login1")).sendKeys(user);
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys(pwd);
	Thread.sleep(1000);
	driver.findElement(By.className("signinbtn")).click();
	 
	boolean logoutlink = wait.until(ExpectedConditions.elementToBeClickable(By.className("rd_logout"))).isEnabled();
	if(logoutlink == true) { 
	driver.findElement(By.className("rd_logout")).click();
	}else {
		System.out.println("Logout link is disabled");
	}
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}