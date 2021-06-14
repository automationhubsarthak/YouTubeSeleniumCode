package browser_options;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hindi_ChromeOptions {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		//1. PageLoadStrategy
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		//2. Infobars - We will try to remove that info
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		//3. extensions
		//options.setExperimentalOption("excludeSwitches", Collections.singletonList("load-extension"));
		
		//4. Incognito //Ctrl+Shift+N after opening a browser
		options.addArguments("--incognito");
		
		//5. Maximize
		options.addArguments("--start-maximized");
		
		
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		

	}

}
