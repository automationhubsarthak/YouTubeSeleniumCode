package xpath_dynamic;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWeatherMap_Xpath {
	
	public static WebDriver driver;
	
    public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
		 options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		 options.addArguments("--start-maximized");
		 options.addArguments("--incognito");
		 driver = new ChromeDriver(options);
		 driver.get("https://openweathermap.org/");
		 
		 
		 
		 
		 

	}

}
