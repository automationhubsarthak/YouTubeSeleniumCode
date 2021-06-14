package locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Old_Locators {
   public static WebDriver driver;
	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://rediff.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
	
	//className
	driver.findElement(By.className("signin")).click();
	//id
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	//name
	driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
	//xpath
	driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();
	//cssSelector
	
	driver.findElement(By.cssSelector("a[class = rd_logout]")).click();
	//linktext
	driver.findElement(By.linkText("Feedback")).click();
    
  	//partialLinkText
	driver.findElement(By.partialLinkText("Click he")).click();
	
	//tagname
	          List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	          System.out.println("The total number of links with tagname a are :" + allLinks.size());
	          for(int i = 0; i<allLinks.size() ; i++) {
	        	  System.out.println(allLinks.get(i).getText());
	          }

	}

}
