package taditseleniumbatch2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionPoints {
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
	//isDisplayed
		
			boolean signinlink = driver.findElement(By.className("signin")).isDisplayed();
			
			if(signinlink == true) {
				System.out.println("the link is displayed");
			}else {
				System.out.println("the link is not displayed");
			}
		
			driver.findElement(By.className("signin")).click();
		
			//isEnabled
			boolean username = driver.findElement(By.id("login1")).isEnabled();
			if(username == true) {
				System.out.println("the username textbox is enabled");
			}else {
				System.out.println("the username textbox is not enabled");
			}
			
			//isSelected
			
			boolean checkbox = driver.findElement(By.id("remember")).isSelected();
			if(checkbox == true) {
				System.out.println("the checkbox is selected");
			}else {
				System.out.println("the checkbox is not selected");
			}
			
			 

	}

}
