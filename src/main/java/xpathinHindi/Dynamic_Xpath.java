package xpathinHindi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Xpath {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//driver.findElement(By.xpath("//a[text() = 'Enterprise Email']")).click();
		//driver.findElement(By.xpath("//a[contains(text(), 'Money')]")).click();
		
		//driver.findElement(By.xpath("//span[contains(@class, 'forgotlink')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'f12')]")).click();

	}

}
