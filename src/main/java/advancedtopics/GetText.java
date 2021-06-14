package advancedtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText { //getText( ) is a Selenium WebDrivers predefined method which is used for retrieving the specified elements Text
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		String RediffLogoImage = driver.findElement(By.xpath("//input[@id = 'OAS_subsection']/following::span[1]")).getText();
		System.out.println("The text of the image is ------>" +RediffLogoImage );
		
		String Mailicontext = driver.findElement(By.className("mailicon")).getText();
		System.out.println("The text of the mailicon link is ----->" + Mailicontext);
		
		
	}

}
