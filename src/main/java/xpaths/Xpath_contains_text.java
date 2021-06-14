package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_contains_text {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//driver.findElement(By.xpath("//a[text() = 'Create Account']")).click();
		
		//driver.findElement(By.xpath("//a[contains( text(), 'Enterprise Email')]")).click();
		
		driver.findElement(By.xpath("//a[contains(@class, 'vdicon')]")).click();

	}

}
