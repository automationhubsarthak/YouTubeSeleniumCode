package javascriptexecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JS_Rediff {
	//JavaScriptExecutor - this is an interface which helps to execute JavaScript via Selenium WebDriver
	//2 methods - executescript, executeAsyncScript
	
	//Basic Syntax
	// JavaScriptExecutor js = (JavaScriptExecutor) driver;
	//js.executeScript(Script, Arguments);
	
	//Why even we need to use this ? Xpath, cssSelector, id, name, class 
	
	public static WebDriver driver;
	
	@Test
	public static void rediffLogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\BROWSER DRIVERS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//open browser
		js.executeScript("window.location = 'https://mail.rediff.com/cgi-bin/login.cgi' ");
		//enter username and password 
		js.executeScript("document.getElementById('login1').value = 'seleniumpanda@rediffmail.com' ");
		js.executeScript("document.getElementById('password').value = 'Selenium@123' ");
		
		WebElement SignInButton = driver.findElement(By.className("signinbtn"));
		js.executeScript("arguments[0].click();", SignInButton);
		
		Thread.sleep(2000);
		js.executeScript("alert('Welcome to RediffMail Inbox'); "); 
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 1200)");
		
		//Calendar - javscriptExecutor
		//scrolling
		
	}

}
