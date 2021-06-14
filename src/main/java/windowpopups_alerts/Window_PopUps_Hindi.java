package windowpopups_alerts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_PopUps_Hindi {

	 public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentwindowhandle = driver.getWindowHandle();
		System.out.println("The parent handle is: " + parentwindowhandle);
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String handle:handles) {
			System.out.println(handle);
			
			if(!handle.equals(parentwindowhandle))
			driver.switchTo().window(handle);
			driver.findElement(By.id("firstName")).sendKeys("Selenium");
			driver.findElement(By.id("lastName")).sendKeys("WebDriver");
			driver.close();		
		}	
		
		driver.switchTo().window(parentwindowhandle);
	    boolean check = driver.findElement(By.id("name")).isEnabled();
	    System.out.println("The control has come back to parent window: " + check);
	    
	    if(check == true) {
	    	driver.findElement(By.id("name")).sendKeys("ControlIsBack");
	    }else {
	    	System.out.println("Control is still with the child window");
	    }
	}
	
	

}
