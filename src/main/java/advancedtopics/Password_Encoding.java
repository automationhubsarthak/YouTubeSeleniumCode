package advancedtopics;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Password_Encoding {
      public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");

	//actual password	
String actualpassword="Selenium@123";

driver.findElement(By.xpath("//a[@class='signin']")).click();

			
			byte[] message = actualpassword.getBytes(StandardCharsets.UTF_8);
			String encodedPassword = Base64.getEncoder().encodeToString(message);
			System.out.println(encodedPassword);
			driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("encodedPassword");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.ENTER);
			
			
			byte[] decoded = Base64.getDecoder().decode(encodedPassword);
			System.out.println(new String(decoded, StandardCharsets.UTF_8));

	}

}