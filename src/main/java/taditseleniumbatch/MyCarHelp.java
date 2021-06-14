package taditseleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyCarHelp {
public static WebDriver driver;

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.mycarhelpline.com/");
			//driver.findElement(By.xpath("//a[text() = 'Calculator']")).click();
			//driver.findElement(By.xpath("//div[@id = 'bodycontainer-innerpage']/descendant::ul[1]/following-sibling::div[1]/child::table[1]/descendant::img[1]")).click();
			//WebElement button = driver.findElement(By.tagName("a"));
			//System.out.println(button);
			//System.out.println(button.getAttribute("href"));
			
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			System.out.println(allLinks.size());
			
			for(int i=0; i<allLinks.size() ; i++) {
				System.out.println(allLinks.get(i).getText());
			}

	}

}
