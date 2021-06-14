package waitconditions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaits {
	public static WebDriver driver;
	public static WebDriverWait wait;

public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("signin")));
		driver.findElement(By.className("signin")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login1")));
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
	    boolean signinbutton = wait.until(ExpectedConditions.elementToBeClickable(By.className("signinbtn"))).isEnabled();
	    if(signinbutton == true) {
		driver.findElement(By.className("signinbtn")).click();
	    } else {
	    	System.out.println("the signinbutton is not enabled");
	    }
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.className("rd_logout")));
		 driver.findElement(By.className("rd_logout")).click();

	}

}
