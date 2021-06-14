package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosftEdgeDriver {

	public static void main(String[] args) {

      System.setProperty("webdriver.edge.driver",  "C:\\Windows\\System32\\MicrosoftWebDriver.exe");
      WebDriver driver = new EdgeDriver();
      driver.get("https://google.com");
      driver.manage().window().maximize();

	}

}
