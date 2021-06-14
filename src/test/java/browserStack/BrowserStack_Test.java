package browserStack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BrowserStack_Test {
	WebDriver driver;
	SoftAssert softassert;
	DesiredCapabilities cap; 
	public static String USERNAME = "sarthakkumarpand1";
	public static String ACCESSKEY = "QFeoYpFpXopJ6nHqdQQK";
	public static String URL = "https://" +USERNAME+ ":" +ACCESSKEY+ "@hub.browserstack.com/wd/hub";
	
	@BeforeTest
	public void openWizdom7() throws MalformedURLException {
		cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		cap.setVersion("78");
		cap.setCapability("browserstack.debug", true);
	}
	
		@Test
		public void remotewebdriver() throws MalformedURLException {
		URL browserStackURL = new URL(URL);
		driver = new RemoteWebDriver(browserStackURL, cap);
		driver.get("http://182.156.251.238/Wiz7QC/Default.aspx?ClientId=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String CurrentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://182.156.251.238/Wiz7QC/Default.aspx?ClientId=1";
		softassert.assertEquals(CurrentURL, ExpectedURL, "Actual and Expected are not same");
		softassert.assertAll();
		
		}
		
		@AfterTest
		public void tearDown() {
				driver.quit();
	}
}
