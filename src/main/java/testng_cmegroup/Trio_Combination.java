package testng_cmegroup;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trio_Combination {
public static WebDriver driver;

     @BeforeTest
      public void initialization(){
       WebDriverManager.chromedriver().setup();
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--start-maximized");
       //options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
       options.addArguments("--incognito");
       driver = new ChromeDriver(options);
       driver.get("https://www.cmegroup.com/");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     }

     @Test
    public void clickOnLogin() throws InterruptedException {
         driver.findElement(By.xpath("//span[text() = 'Log In']")).click();

     }

     @Test(enabled = true)
     public void clickOnCreateAccount() throws InterruptedException {
    
         driver.findElement(By.xpath("//a[@class = 'btn btn--secondary']")).click();
     }
     
    



     @AfterTest
    public void tearDown(){
         driver.close();
     }
}

