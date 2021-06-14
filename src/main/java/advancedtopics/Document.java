package advancedtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Document {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//String doc = driver.getPageSource();
		//System.out.println("the total document is: " + doc);
		
		WebElement doc = driver.findElement(By.tagName("body"));
		System.out.println("the doc is: " + doc.getText());
		
		//driver.quit();
	}

}
