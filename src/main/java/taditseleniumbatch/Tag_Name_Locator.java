package taditseleniumbatch;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tag_Name_Locator {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println("the total number of links in this WebPage is : " + AllLinks.size());
		//find the names of all the links
		for(int i = 0; i <AllLinks.size(); i++) {
			System.out.println(AllLinks.get(i).getText());
		}
		
	}

}
