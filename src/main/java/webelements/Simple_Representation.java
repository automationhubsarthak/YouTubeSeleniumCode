package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebElement.html
public class Simple_Representation {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		
		WebElement signinlink = driver.findElement(By.cssSelector("a.login"));
		WebElement contactuslink = driver.findElement(By.cssSelector("div#contact-link>a:nth-child(1)"));
		
		if(signinlink.equals(contactuslink)) {
			System.out.println("Both the links are equal");
		}else {
			System.out.println("Both are different");
		}
	

	}

}
