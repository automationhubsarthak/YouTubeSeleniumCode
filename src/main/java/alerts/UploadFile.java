package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//div[@id = 'user-signup-actions']/descendant::span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#file-upload")).sendKeys("C:\\Users\\Asus\\OneDrive\\Desktop\\SARTHAK\\Selenium You Tube Channel\\Resume.docx");
	    
	}

}
