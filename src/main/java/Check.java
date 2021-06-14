import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check {
	public static WebDriver driver;
	

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D://chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
		
		  driver.get("http://the-internet.herokuapp.com/entry_ad"); WebDriverWait wait
		  = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.elementToBeClickable(By.
		  xpath("//div[@id = 'modal']/child::div[@class = 'modal']/child::div[@class = 'modal-footer']"
		  ))); driver.findElement(By.
		  xpath("//div[@id = 'modal']/child::div[@class = 'modal']/child::div[@class = 'modal-footer']"
		  )).click(); System.out.println("It clicked on the close button");
		 
	  boolean launchtimepopup = driver.findElement(By.xpath("//div[@id = 'modal']/child::div[@class = 'modal']/child::div[@class = 'modal-footer']")).isDisplayed();
	  if(launchtimepopup == false) {
		  System.out.println("Code passed");
	  }else {
		  System.out.println("Code failed");
	  }

	}

}
