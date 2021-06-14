package mouseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_actions {
	public static WebDriver driver;
	
public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/keyboard-events-sample-form/");
	//	driver.get("http://uitestpractice.com/students/actions");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
		
		Actions actions = new Actions(driver);
	  //WebElement number1 = driver.findElement(By.name("one"));
	 // WebElement number4 = driver.findElement(By.name("four"));
	 // WebElement number9 = driver.findElement(By.name("nine"));
	 // WebElement number12 = driver.findElement(By.name("twelve"));
	  
    // actions.keyDown(Keys.CONTROL).click(number1).click(number4).click(number9).click(number12).keyUp(Keys.CONTROL).perform();
		
	WebElement Username = driver.findElement(By.id("login1"));
	WebElement Password = driver.findElement(By.id("password"));
	WebElement SignInButton = driver.findElement(By.className("signinbtn"));
	
	//actions.click(Username).sendKeys("seleniumpanda@rediffmail.com").perform();
	//actions.click(Password).sendKeys("Selenium@123").perform();
	//actions.click(SignInButton).perform();
	
	//actions.click(Username).sendKeys("seleniumpanda@rediffmail.com").perform();
	//actions.keyDown(Username, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	//actions.keyDown(Username, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	
	//actions.click(Password).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	
	//actions.click(SignInButton).perform();
	
	actions.click(Username).keyDown(Keys.SHIFT).sendKeys("seleniumpanda").perform();
	
	
	
	  
	  
	  
		
		
	
	}

}
