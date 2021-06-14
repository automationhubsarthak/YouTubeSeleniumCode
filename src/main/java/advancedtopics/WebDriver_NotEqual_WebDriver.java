package advancedtopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_NotEqual_WebDriver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new WebDriver(); //WebDriver is an interface 
		                                                              // Can we make Object of an interface ?? - No
		
		WebDriver driver = new ChromeDriver();
        //interface reference = object of the implementing class - form of a Top Casting
		driver.get("http://google.com");
	}

}
