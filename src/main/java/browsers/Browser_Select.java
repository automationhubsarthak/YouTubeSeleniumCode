package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser_Select {
	
	WebDriver driver;
	
	
	@BeforeTest
	@Parameters("browser")
	public void browserselect(String browser) {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\BROWSER DRIVERS\\CHROMEDRIVER\\chromedriver.exe");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D:\\SELENIUM\\chrome.txt");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			driver=new ChromeDriver();
			System.out.println("Open Chrome Browser");
		}
		else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM\\BROWSER DRIVERS\\GECKODRIVER\\geckodriver.exe");
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"D:\\SELENIUM\\dumphere.txt");
			driver = new FirefoxDriver();
			System.out.println("Open Firefox Browser");
		}
		else if(browser.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Windows\\System32\\MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}
		else {
			throw new SkipException("None of the browser is correct");
		}
		}
	
	@Test
	public void OpenURL() {
		driver.get("http://182.156.251.238/Wiz7QC/Default.aspx?ClientId=1");
		driver.findElement(By.xpath("//input[@id = 'UserName']")).clear();
		driver.findElement(By.xpath("//input[@id = 'UserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id = 'Password']")).clear();
		driver.findElement(By.xpath("//input[@id = 'Password']")).sendKeys("password");
		driver.findElement(By.xpath("//div[@id = 'loginContainer']/descendant::div[20]/a[1]")).click();	
	    }
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	    }

}
