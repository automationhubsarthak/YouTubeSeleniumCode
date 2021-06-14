package taditseleniumbatch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_PopUps {
	
	public static WebDriver driver;
	public static Alert alert;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		driver.findElement(By.className("signin")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.className("signinbtn")).click();
		
		//Alert is an interface. 
		//What are the 3 methods in Alert interface
		//getText(), accept(), dismiss()
		 alert = driver.switchTo().alert();
		System.out.println("the text message inside the alert window is :" + alert.getText());       //this will give you the message inside the alert window
		Thread.sleep(3000);
		alert.accept();
		//alert.dismiss();
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("rd_logout")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class = 'main_container']/preceding::b[1]")).click();
		
		
		
		
		
		

}
	
}
