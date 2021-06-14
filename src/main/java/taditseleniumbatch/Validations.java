package taditseleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations {
	public static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D:\\chromelog.txt");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bedbathandbeyond.com/");
		System.out.println("The title of this website is : " + driver.getTitle());
		
		//Validation of getTitle();
		String ActutalTitle = "Bedding, Bath Towels, Cookware, Fine China, Wedding & Gift Registry | Bed Bath & Beyond"; 
		String ExpectedTitle = driver.getTitle();
		if(ExpectedTitle.equals(ActutalTitle)) {
			System.out.println("Test Case is PASS");
		}else {
			System.out.println("Test Case is FAIL");
		}
		
		//Validation of getCurrentUrl();
		System.out.println("The currentUrl of this website is : " + driver.getCurrentUrl());
        String ActualCurrentUrl = "https://www.bedbathandbeyond.com/";
        String ExpectedCurrentUrl = driver.getCurrentUrl();
        if(ExpectedCurrentUrl.equals(ActualCurrentUrl)) {
        	System.out.println("Test case is PASS");
        }else {
        	System.out.println("Test case is FAIL");
        }
        
        driver.close();
        
        
	}

}
