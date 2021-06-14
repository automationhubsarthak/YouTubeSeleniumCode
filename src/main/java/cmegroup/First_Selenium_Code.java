package cmegroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Selenium_Code {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\BROWSER DRIVERS\\chromedriver.exe"); //invoking the browser driver
		WebDriver driver = new ChromeDriver(); //creating the object of ChromeDriver class by the help of reference of WebDriver Interface
		
		driver.get(" https://www.cmegroup.com/ ");
		
	}

}
