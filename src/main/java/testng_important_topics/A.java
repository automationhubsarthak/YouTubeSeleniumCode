package testng_important_topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {
	public WebDriver driver;


	@Test()
	public void test1() throws Exception {
		System.out.println("Trying to test1 | " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\BROWSER DRIVERS\\CommonDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://rediff.com");
		Thread.sleep(4000);
		driver.close();
	}

	@Test
	public void test12() throws Exception {
		System.out.println("Trying to test2 | " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\BROWSER DRIVERS\\CommonDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void test3() throws Exception {
		System.out.println("Trying to test3 | " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\BROWSER DRIVERS\\CommonDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		Thread.sleep(4000);
		driver.close();
	}


}
