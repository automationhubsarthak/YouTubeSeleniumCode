package openweathermap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLabels {
	public static WebDriver driver;
	public static SoftAssert softassert;
	
	@BeforeTest
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D:\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--incognito");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-infobar");
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");				
}
	
	@Test(enabled = true)
	public  void invalidCity() throws InterruptedException {
		softassert = new SoftAssert();
		driver.findElement(By.cssSelector(".form-control.border-color.col-sm-12")).sendKeys("InvalidCity");
		driver.findElement(By.xpath("//form[@id = 'searchform']/child::button[1]")).click();
		Thread.sleep(2000);
		softassert.assertTrue(driver.findElement(By.xpath("//*[text()='Not found']")).isDisplayed(), "Not found text does not show up");
		softassert.assertAll();
	}
	
	@Test(enabled = true)
	public  void validCity() throws InterruptedException {
		softassert = new SoftAssert();
		driver.get("https://openweathermap.org/");
		driver.findElement(By.cssSelector(".form-control.border-color.col-sm-12")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//form[@id = 'searchform']/child::button[1]")).click();
		Thread.sleep(2000);
		softassert.assertTrue(driver.findElement(By.linkText("Mumbai, IN")).isDisplayed(),"Mumbai is not displayed");
		softassert.assertAll();
	}
	
	@Test(enabled = true)
	public void verifyHomePage() throws InterruptedException
	{
	 
		List<WebElement> menulinks=driver.findElements(By.cssSelector(".nav.navbar-nav.navbar-right"));
		List<WebElement> menulink=menulinks.get(0).findElements(By.className("nav__item"));
		for(int i=0 ; i<menulink.size() ; i++)
		{
			System.out.println(menulink.get(i).getText()+" link is verified");
			softassert = new SoftAssert();
			softassert.assertTrue(menulink.size()==10,"The size of menulinks is not 10");
			driver.findElement(By.linkText(menulink.get(0).getText())).click();
			softassert.assertEquals(driver.findElement(By.className("breadcrumb-title")).getText(),"Weather forecast");
			break;	
		}
		driver.findElement(By.xpath("//a[@class = 'navbar-brand']/child::img[1]")).click();
		Thread.sleep(2000);	

		driver.findElement(By.linkText("API")).click();
		softassert.assertEquals(driver.findElement(By.className("breadcrumb-title")).getText(),"Weather API");
		driver.findElement(By.linkText("Pricing")).click();
		softassert.assertEquals(driver.findElement(By.className("breadcrumb-title")).getText(),"Pricing");
		driver.findElement(By.linkText("Partners")).click();
		softassert.assertEquals(driver.findElement(By.className("breadcrumb-title")).getText(),"Partners and solutions");
		driver.findElement(By.linkText("Stations")).click();
		softassert.assertEquals(driver.findElement(By.className("breadcrumb-title")).getText(),"Weather stations");
		driver.findElement(By.linkText("Widgets")).click();
		softassert.assertEquals(driver.findElement(By.className("breadcrumb-title")).getText(),"Widgets-----constructor");
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Maps"))).click().build().perform();
		driver.findElement(By.linkText("Weather maps")).click();
		softassert.assertAll();
		Thread.sleep(3000);	
	
	}
		
		@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
