package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InternetExplorer_Weird {

	public static WebDriver driver;

	@BeforeTest
	public static void initializeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("http://google.com");
	}


	@Test
	public static void maximizebrowser() {
		driver.manage().window().maximize();
	}

	@Test
	public void closebrowser() {
		driver.close();
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();
	}

}
