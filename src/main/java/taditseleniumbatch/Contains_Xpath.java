package taditseleniumbatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Contains_Xpath {
	public static WebDriver driver; 

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		//contains to determine the Xpath
		driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@class, 'signinbtn')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[text() = 'Rediff Home']")).click();

	}

}
