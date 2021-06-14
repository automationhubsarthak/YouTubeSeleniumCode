package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Easy_Complicated {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycarhelpline.com/");
		driver.findElement(By.xpath("//div[@id = 'bluemenu']/child::ul[1]/child::li[6]/child::a[1]")).click();
		//driver.findElement(By.xpath("//div[@id = 'bodycontainer-innerpage']/child::div[@class = 'innerpage-bodycontainer-left']/child::div[1]/child::table[1]/descendant::img[1]")).click();
	driver.findElement(By.xpath("//div[@id = 'header-container']/preceding-sibling::table[3]/preceding::img[4]")).click();
	}

}
