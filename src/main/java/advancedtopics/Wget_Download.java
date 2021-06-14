package advancedtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wget_Download {
public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String url = "https://www.gst.gov.in/download/returns";
	
	driver.get(url);
	WebElement downloadButton = driver.findElement(By.className("ng-isolate-scope"));
	String sourceLocation = downloadButton.getAttribute("href");
	String wgetcommand = "cmd /c C:\\Wget\\wget.exe -P D:\\SELENIUM\\DownloadWget --no-check-certificate " + sourceLocation;
	
	
        Process exec = Runtime.getRuntime().exec(wgetcommand);
        int exitVal = exec.waitFor();
        System.out.println("Exit value: " + exitVal);
        
        driver.close();
        }

	}


