package taditseleniumbatch;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Properties_File_Concept {
	public static WebDriver driver;
	public static Properties prop;

	
	@Test
	public void Rediff() throws Exception {
		 prop = new Properties();
		 FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\taditseleniumbatch\\config.properties");
		 prop.load(ip);
		 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(prop.getProperty("url"));
		 driver.findElement(By.xpath("//a[@class = 'signin']")).click();
			driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys(prop.getProperty("username")); 
			driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(prop.getProperty("password")); 
			driver.findElement(By.xpath("//input[@id = 'password']/following-sibling::input[@name = 'proceed' and @class = 'signinbtn']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class = 'main_container']/preceding::b[1]")).click();
		 
		 
		 
		
	}

}
