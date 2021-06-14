package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Demo {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/iframe-practice-page/");
		
		List<WebElement> TotalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("The total frames are : " + TotalFrames.size());
		
		
		for(int i=0; i< TotalFrames.size(); i++) {
			driver.switchTo().frame(i);
			int s = driver.findElements(By.xpath("//div[@id = 'page']/child::a[1]")).size();
			System.out.println("Size is : " + s);
			
			if(s==0) {
				driver.switchTo().defaultContent();
				}else
			        {
					break;
				}
			
			driver.findElement(By.xpath("//div[@id = 'page']/child::a[1]")).click();
			driver.switchTo().defaultContent();
		}
		
	}

}
