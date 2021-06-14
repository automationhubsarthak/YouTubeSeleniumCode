package xpathVScssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");

		//signin link
		//driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.cssSelector("a.signin")).click();
		
		//username textbox
		//driver.findElement(By.xpath("//input[@id = 'login1' and @name = 'login']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input[id *= login1]")).sendKeys("seleniumpanda@rediffmail.com");
		
		//password textbox
		//driver.findElement(By.xpath("//input[@id = 'login1']/following::div[@class = 'row']/child::div[2]/child::input[@name = 'passwd']")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("div#div_login_error + div.table > div:nth-child(1) + div.row > div:nth-child(2) > input:nth-of-type(1)")).sendKeys("Selenium@123");
		
		//signin button
		//driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		Thread.sleep(3000);
		//logout link
		//driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
		driver.findElement(By.cssSelector("a.rd_logout")).click();
		
		
		Thread.sleep(3000);
		//RediffHomeLogo Link
		//driver.findElement(By.xpath("//div[@class = 'main_container']/preceding::b[1]")).click();
		driver.findElement(By.cssSelector("div.header>div:nth-child(1)>a + span > a:nth-of-type(2) > b")).click();
		
		
		
	}

}
