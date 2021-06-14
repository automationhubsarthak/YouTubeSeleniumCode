package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Understanding {
public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("The text inside the alert is :" + alert.getText());
		
		Thread.sleep(2000);
		alert.accept();
		
		//alert.dismiss();
		
		
		
		
		

	}

}
