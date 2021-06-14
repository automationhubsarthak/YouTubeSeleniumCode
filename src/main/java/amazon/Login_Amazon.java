package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\SELENIUM\\BROWSER DRIVERS\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		

	}

}
