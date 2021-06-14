package advancedtopics;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUps_Handles {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parenthandle = driver.getWindowHandle();
		System.out.println("The parent handle is: " + parenthandle);
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles) {
			System.out.println(handle);
			
			if(!handle.equals(parenthandle)){
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Sarthak");
				driver.close();
			}	
		}
		
		driver.switchTo().window(parenthandle);
		boolean check = (driver.findElement(By.id("name")).isEnabled());
		System.out.println("The result of check is: " + check);
		if(check == true) {
			driver.findElement(By.id("name")).sendKeys("Selenium");
		}else {
			System.out.println("The control did not come to parent window");
		}

 driver.quit();
	}

}
