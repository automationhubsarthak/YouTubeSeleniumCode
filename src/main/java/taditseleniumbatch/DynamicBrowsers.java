package taditseleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicBrowsers {
	//cross browser testing / multiple browser testing
	public static WebDriver driver;
	
    public static void main(String[] args) {
	 String Browser = "Mozilla";
	 
	 if(Browser.equals("chrome")) {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");
	 }
	 else if(Browser.equals("Mozilla")) {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");
	 }
	 else if(Browser.equals("Internet Explorer")) {
		 WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.google.com");
			
	 }else if(Browser.equals("Microsoft Edge")) {
		 WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			 driver.get("https://www.google.com");
	 }
	 else {
		 System.out.println("none of the browsers is compatible");
	 }

	}

}
