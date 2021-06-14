package autoitcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TinyUpload_Website {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tinyupload.com/");
        
		System.out.println(driver.findElement(By.className("pole_plik")).isEnabled());
		boolean link = driver.findElement(By.className("pole_plik")).isEnabled();
		if(link == true) {
			driver.findElement(By.className("pole_plik")).click();
		}
		
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\AutoIT Test\\TinyUpload.exe");
		
		Thread.sleep(3000);
		driver.close();

	}

}
