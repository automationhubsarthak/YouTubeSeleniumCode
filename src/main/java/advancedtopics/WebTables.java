package advancedtopics;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D:\\SELENIUM\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
	    driver.get("http://182.156.251.238/Wiz7QC/Default.aspx?ClientId=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id = 'UserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id = 'Password']")).sendKeys("password");
		driver.findElement(By.xpath("//div[@id = 'loginContainer']/descendant::div[20]/a[1]")).click();
		
		driver.findElement(By.xpath("//div[@id = 'QLGrpId1']/child::a[1]")).click();
		driver.findElement(By.xpath("//li[@id = 'QLid2']/child::a[1]")).click();
		driver.findElement(By.xpath("//td[contains(text(), 'dummyId@dummySite.com')]/preceding-sibling::td[1]/parent::*/child::td[1]/child::input[@type = 'checkbox' and @name = 'SelectedUsers']")).click();
        driver.findElement(By.xpath("//td[contains(text(), 'prateek@gupta.com')]/preceding::td[1]/parent::*/child::td[1]/child::input[@value = '1034' and @type = 'checkbox' and @name = 'SelectedUsers']")).click();
		driver.findElement(By.xpath("//input[@id = 'CSVExistFlag']/following::button[1]")).click();
        
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id = 'runTimeErrorDetail']/preceding::a[2]")));
        
        driver.findElement(By.xpath("//div[@id = 'runTimeErrorDetail']/preceding::a[2]")).click();
	}

}