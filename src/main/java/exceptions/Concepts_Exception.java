package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Concepts_Exception {
	public static WebDriver driver;
	
   public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.rediff.com/");

  
	Thread.sleep(2000);

  
  driver.findElement(By.className("signin")).click();
	}

}
