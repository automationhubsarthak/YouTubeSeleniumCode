package testnglearning_youtubechannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data_DataProvider.Data_Excel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases_ExcelSheet_DataProvider {
	
	public static WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.rediff.com/");
		 	}
	
	@Test(dataProviderClass = Data_Excel.class, dataProvider = "getExcelData")
	public void Combo1(String username, String password) {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
