package taditseleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Rediff {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		Actions actions = new Actions(driver);
		
		//signinlink
		WebElement signinlink = driver.findElement(By.className("signin"));
		//actions.moveToElement(signinlink).perform();
		//actions.contextClick(signinlink).perform();
		actions.click(signinlink).perform();
		
		WebElement username = driver.findElement(By.id("login1"));
		actions.sendKeys(username, "seleniumpanda@rediffmail.com").perform();
		
		WebElement password = driver.findElement(By.id("password"));
		actions.sendKeys(password, "Selenium@123").perform();
		
		driver.navigate().back();
		Thread.sleep(2000);
	
		WebElement createaccountlink = driver.findElement(By.cssSelector("p#signin_info>a:nth-of-type(2)"));
		System.out.println("the text of this link is :" + createaccountlink.getText());
		
	}

}
