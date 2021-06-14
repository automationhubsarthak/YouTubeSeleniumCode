package hotlanta;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Hotlanta {

	public static WebDriver driver;

	@BeforeTest
	public void LaunchingBrowser() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D:\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://192.168.0.184");
		// driver.get("http://porta.3csoftware.com");

	}

	@Test(priority = 1, enabled = true)
	public void login() throws Exception {
		driver.findElement(By.xpath("//input[@name = 'UserName']")).sendKeys("Pankaj");
		driver.findElement(By.xpath("//input[@name = 'Password']")).sendKeys("l0cked");
		driver.findElement(By.xpath("//div[@id = 'devextreme0']/descendant::span[@class = 'dx-button-text']")).click();

		List<WebElement> TotalLinks = driver.findElements(By.tagName("a"));
		int total = TotalLinks.size();
		System.out.println("total links in this page is :" + total);
		for (WebElement eachItem : TotalLinks) {
			if (eachItem.isDisplayed()) {
				System.out.println(eachItem.getText());
			}
		}
		driver.findElement(By.linkText("Hotlanta 115")).click();
		System.out.println("The title of the page is : " + driver.getTitle());

		Thread.sleep(3000);

	}

	@Test(priority = 2, enabled = true, dependsOnMethods = { "login" })
	public void manageAlert() throws IOException {

		driver.findElement(By.xpath("//div[@id = 'lightbox']/following-sibling::div[1]/descendant::button[1]")).click();
		//Runtime.getRuntime().exec("C:\\AutoIT Test\\Impact.exe");
		driver.findElement(By.xpath("//input[@id = 'input-search']")).sendKeys("Calculations");
	  driver.findElement(By.xpath("//input[@id = 'input-search']/following::div[1]/child::button[1]/child::*")).click();
		

	}

	@AfterTest
	public void tearDown() {
		//driver.close();
	}
}
