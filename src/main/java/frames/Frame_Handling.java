package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Handling {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D:\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
		driver.get("https://openweathermap.org/");
		
		int TotalFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The total number of frames is : " + TotalFrames);
		
		/*
		 * driver.switchTo().frame(0); //switch to first frame
		 * driver.findElement(By.id("something")).click();
		 * driver.switchTo().defaultContent();
		 */
		
		for(int i=0; i<TotalFrames; i++) {
			driver.switchTo().frame(i);
			int s = driver.findElements(By.id("something")).size();
			System.out.println("Size is : " + s);
			
			if(s==0) {
				driver.switchTo().defaultContent();
			}else {   //if it is not zero then you have found the frame		
				break;
			}
			
		}
		

	}

}
