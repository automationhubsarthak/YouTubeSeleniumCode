package cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nth_Concept_cssSelector {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rediff.com");
		
			//signin link
			driver.findElement(By.cssSelector("p#signin_info>a:nth-child(1)")).click();
			//driver.findElement(By.cssSelector("p#signin_info>:nth-child(1)")).click();
			//driver.findElement(By.cssSelector("p#signin_info>a:nth-of-type(1)")).click();
			
			//username textbox
			//driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(1)>div:nth-child(2)>input:nth-child(1)")).sendKeys("seleniumpanda@rediffmail.com");
           driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(1)>div:nth-of-type(2)>input:nth-of-type(1)")).sendKeys("seleniumpanda@rediffmail.com");
			
           //password textbox
           driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(2)>div:nth-of-type(2)>input:nth-of-type(1)")).sendKeys("Selenium@123");
           
           //signinbutton
           driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(2)>div:nth-of-type(2)>input:nth-of-type(2)")).click();
           
           
           Thread.sleep(3000);
           
           //LogOut Link
           driver.findElement(By.cssSelector("div.setting_rd>a:nth-child(5)")).click();
			
	}

}
