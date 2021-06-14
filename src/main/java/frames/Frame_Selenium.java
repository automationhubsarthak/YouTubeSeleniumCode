package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Selenium {
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		List<WebElement> TotalFrames = driver.findElements(By.tagName("frame"));
		System.out.println("Total Number of Frames :" + TotalFrames.size());
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//h1[@class = 'bar']/following::div[@class = 'indexContainer']/descendant::a[1]")).click();
		driver.switchTo().defaultContent();

	}

}
