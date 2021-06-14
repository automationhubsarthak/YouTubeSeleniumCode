import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GmailvsYahoo {

	
	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\BROWSER DRIVERS\\CommonDrivers\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D:\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");	
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://gmail.com");
	    driver.findElement(By.xpath("//input[@id = 'identifierId']")).sendKeys("seleniumpanda@gmail.com");
	    driver.findElement(By.xpath("//input[@id = 'identifierId']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Selenium@123");
	    driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("Learn more")).click();  
	    
	    
	     /* FirefoxOptions options1 = new FirefoxOptions();
	    options1.addArguments("--private"); 

	    System.setProperty("webdriver.gecko.driver",  "D:\\SELENIUM\\BROWSER DRIVERS\\CommonDrivers\\geckodriver.exe");
	    System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
	    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"D:\\SELENIUM\\dumphere.txt");
		WebDriver driver1= new FirefoxDriver(options1); 
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.get("https://mail.yahoo.com");
		driver1.findElement(By.xpath("//body[@id = 'signin-main']/descendant::span[text() = 'Sign in']")).click();
		driver1.findElement(By.xpath("//input[@id = 'login-username']")).sendKeys("seleniumpanda@yahoo.com");
		driver1.findElement(By.xpath("//input[@id = 'login-username']")).sendKeys(Keys.ENTER);
		driver1.findElement(By.xpath("//input[@id = 'login-passwd']")).sendKeys("Automation@123");
		driver1.findElement(By.xpath("//input[@id = 'login-passwd']")).sendKeys(Keys.ENTER);
		driver1.findElement(By.xpath("//input[@id = 'ybarAccountMenu']/following::label[1]/child::span[contains(text(), 'Selenium')]")).click();
		driver1.findElement(By.xpath("//script[@id = 'ybarAccMenuItemTemplate']/preceding::span[1]")).click();  */
	}

}
