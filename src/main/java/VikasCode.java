

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VikasCode {

	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://eviltester.github.io/synchole/buttons.html");
		int i = 1;
		
		while(i<3);
		waitUntilElementToBeClickable(driver,By.id("button00"));
		waitUntilElementToBeClickable(driver,By.id("button01"));
		waitUntilElementToBeClickable(driver,By.id("button02"));
		waitUntilElementToBeClickable(driver,By.id("button03"));
		i++;
		driver.navigate().refresh();
	}

	static void waitUntilElementToBeClickable(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 7);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();
		
	}

}
