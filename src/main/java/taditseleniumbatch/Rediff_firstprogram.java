package taditseleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_firstprogram {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.className("signin")).click();
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.partialLinkText("Sign i")).click();
		//driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		//driver.findElement(By.xpath("//a[text() = 'Sign in']")).click();
		//driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();
		driver.navigate().back();
		//driver.findElement(By.xpath("//input[@id = 'login1' and @name = 'login']")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//input[@id = 'password' and @name = 'passwd']")).sendKeys("Selenium@123");
		//driver.findElement(By.xpath("//input[@name = 'proceed' and @class = 'signinbtn']")).click();
		
		
	//assignment - use linkText and partiallinkText for CreateAccount	
		
		/*Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.name("proceed")).click();
		//you will have to logout as well
		Thread.sleep(3000);
		driver.findElement(By.className("rd_logout")).click();
		driver.findElement(By.partialLinkText("Rediff Hom")).click(); */

	}

}
