package images;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image_Validation {
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		List<WebElement> TotalImages = driver.findElements(By.tagName("img"));
		System.out.println(TotalImages.size());
		
	 
		WebElement image1 = driver.findElement(By.xpath("//div[@class = 'image']/descendant::img[1]"));
		WebElement image2 = driver.findElement(By.xpath("//div[@class = 'bigstory']/descendant::img[1]"));
		
		if(image1.equals(image2)) {
			System.out.println("Both the images are the same");
		}else {
			System.out.println("Images are different");
		}
		
		
		

	}

}
