package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Frames {      //What are Frames - Pages within pages
	public static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/iframe-practice-page/");
		//iframe is the tagname which has all the frames
		//total number of frames in the webpage
		
		List<WebElement> TotalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames in this webpage are :" + TotalFrames.size());
		
		//Alerts = driver.switchTo().alert();
		
		//Frames:-
		driver.switchTo().frame(0);
	
		driver.findElement(By.linkText("Skip to content")).click();
		
		driver.switchTo().defaultContent();

	}

}
