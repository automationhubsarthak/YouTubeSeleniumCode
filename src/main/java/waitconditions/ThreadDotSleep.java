package waitconditions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThreadDotSleep {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		
		//Question : When we should use Thread.sleep(2000) ? 
		
		//Answers : When none of the wait conditions are working - implicit waits not working, WebDriverWait is not working - sometimes Thread.sleep works
		//When we are running JENKINS jobs, if you check the output reports (fail) - reasons of failure is timeout exception. Thread.sleep fixes this much efficiently than WebDriverWait
		//During a crunched timeline deliverable = Delivering to UAT[BAs are waiting for test outputs so that they can do the UAT testing thoroughly - you cannot give BAs the output unless
		//all the tests are passing or certain workarounds - so By default sometimes Thread.sleep helps in getting these things done
		//Kaam Chalao - Way of running scripts and ignoring or de-prioritizing the timeout exceptions (this is when Thread.sleep is really handy)
		//If for the same scenario, manual testing is working fine and Automation scripts are failing because of timeout issues - use Thread.sleep and get it to work and promote the build.
		
		Thread.sleep(5000, 200); //+5secs
		driver.findElement(By.className("signin")).click();
		
		
		Thread.sleep(2000); //+2secs
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		Thread.sleep(2000); //+2secs
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		Thread.sleep(2000); //+2secs
		 driver.findElement(By.className("signinbtn")).click();
		 
		 Thread.sleep(2000); //+2secs
		 driver.findElement(By.className("rd_logout")).click();

	}

}
