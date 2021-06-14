package taditseleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelector_Concepts {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		driver.findElement(By.cssSelector("a[class=signin]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-of-type(2)>div:nth-of-type(2)>div:nth-of-type(2)>input:nth-of-type(1)")).sendKeys("Selenium@123");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.floatL.leftwidth>div#div_login_error + div.table > div:nth-child(1) + div > div:nth-child(1) + div.cell > input#password + input.signinbtn")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.rd_logout")).click();
		
		

	}

}
