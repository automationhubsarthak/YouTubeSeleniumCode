

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText { //getText() method is a pre-defined method used in Selenium to retrieve text of a WebElement. But there are certain constraints. It retrieves static text only

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		
		//Rediffmail link
		String RediffLink = driver.findElement(By.className("mailicon")).getText();
		System.out.println("The text of the link is ---->" + RediffLink);
		
		//RediffLogo - is an example where getText() does not work
		String RediffLogo = driver.findElement(By.xpath("//input[@id = 'OAS_subsection']/following::span[1]")).getText();
		System.out.println("The text of the logo is ---->" + RediffLogo);
		
		//CreateAccount Link
		String CreateAccountLink = driver.findElement(By.xpath("//p[@id = 'signin_info']/child::a[2]")).getText();
		System.out.println("The text of the createaccountlink is ---->" + CreateAccountLink);
		

	}

}
