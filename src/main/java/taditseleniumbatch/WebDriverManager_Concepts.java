package taditseleniumbatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_Concepts {
   //Global Variable
	public static WebDriver driver;
	
    public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		driver.manage().deleteAllCookies();
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rediff.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 
	


	}

}
