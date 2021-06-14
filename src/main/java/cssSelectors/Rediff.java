package cssSelectors;

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
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[class=signin]")).click();
		//driver.findElement(By.cssSelector("a.signin")).click();
		//driver.findElement(By.cssSelector(".signin")).click();      - I do not recommend this cssSelector
		
		//driver.findElement(By.cssSelector("input[id = login1]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.cssSelector("#login1")).sendKeys("seleniumpanda@rediffmail.com");  
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.rd_logout")).click();
		
		
	}

}
