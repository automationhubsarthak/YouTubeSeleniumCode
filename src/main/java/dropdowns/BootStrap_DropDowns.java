package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap_DropDowns {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("//li[@id = 'dropdownMenuButton']")).click();
		List<WebElement> dropdown = driver.findElements(By.xpath("//li[@id = 'modelDropdown']/child::ul[1]/li"));
		
		for(int i=0; i<dropdown.size(); i++) {
			WebElement element = dropdown.get(i);
			String innerhtml = element.getAttribute("innerHTML");
			
			if(innerhtml.contentEquals("Control")) {
				element.click();
				break;
			}
			System.out.println("Values from Dropdown is : " + innerhtml);
		}
		
	}

}
