package dropdowns;

import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();        //Ctrl+Shift+N
		
		//1. PageLoadStrategy
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		//2. infobars - Chrome is being controlled by automated software
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		//3. extensions
		//options.setExperimentalOption("excludeSwitches",  Collections.singletonList("load-extension"));
		
		//4. incognito mode
		options.addArguments("--incognito");
		
		//5. browser maximize
		options.addArguments("--start-maximized");
		
		driver = new ChromeDriver(options);
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		List<WebElement> dropdown = driver.findElements(By.xpath("//button[@id='dropdownMenuButton']/following-sibling::div[1]/a"));
		
		for(int i=0; i<dropdown.size(); i++) {
			WebElement webelement = dropdown.get(i);
			String innerhtml = webelement.getAttribute("innerHTML");
		 if(innerhtml.contentEquals("Another action")) {
			 webelement.click();
			 break;
		 }
		
	   System.out.println("Values from dropdown are : " + innerhtml );	
		
		}
	}
}

