package advancedtopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Not_Eq_WebDriver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		// WebDriver driver = new WebDriver();   //WebDriver is an interface
		                                                                //We are trying to create object of interface ??? Is it possible - NO you cannot do this
		
		WebDriver driver = new ChromeDriver(); //top casting - trying to refer to the implementing class' object via interface' reference variable
		driver.get("https://google.co.in");
	}

}
