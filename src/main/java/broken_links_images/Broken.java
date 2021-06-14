package broken_links_images;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://makemysushi.com/404?");
		driver.get("https://rediff.com");
		
		List<WebElement> TotalLinks = driver.findElements(By.tagName("a"));
		TotalLinks.add(driver.findElement(By.tagName("img")));
		System.out.println("The size of Total Links and images is :" + TotalLinks.size());
		
		List<WebElement> ActiveLinks = new ArrayList<WebElement>();
		
		for(int i=0; i<TotalLinks.size(); i++) {
			System.out.println(TotalLinks.get(i).getAttribute("href"));
			if(TotalLinks.get(i).getAttribute("href") != null && (! TotalLinks.get(i).getAttribute("href").contains("javascript"))){
				ActiveLinks.add(TotalLinks.get(i));
			}
		}
		
		System.out.println("The size of Active Links is :" + ActiveLinks.size());
		
		//check the href url with httpconnection api
		for(int j=0; j<ActiveLinks.size(); j++) {
			
			HttpURLConnection connection = (HttpURLConnection) new URL(ActiveLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(ActiveLinks.get(j).getAttribute("href") +"----" +response);
		}

	}

}
