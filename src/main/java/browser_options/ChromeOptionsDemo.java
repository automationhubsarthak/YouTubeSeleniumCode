package browser_options;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsDemo {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	
		//PageLoadStrategy - used to speed up execution
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		//infobars - disable "Chrome is being controlled by automated test software"
		//options.addArguments("disable-infobars");  //  it has been deprecated
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		
		//extensions
		//options.setExperimentalOption("excludeSwitches", Collections.singletonList("load-extension"));
		//options.addArguments("--disable-extensions"); //it has been deprecated
		
		//incognito mode
		options.addArguments("--incognito");
		
		//maximize browser using ChromeOptions
		options.addArguments("--start-maximized");
		
		
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("rd_logout")).click();
		
		
		
		

	}

}
