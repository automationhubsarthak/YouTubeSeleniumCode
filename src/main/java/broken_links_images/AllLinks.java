package broken_links_images;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("div"));
		
		for(WebElement link:allLinks) {
			
			System.out.println(link.getText());
		}
		System.out.println("The total WebElements are :" + allLinks.size());
	}

}
