package mouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot_Operations {
public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
    		   driver.manage().window().maximize();
    		   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    		   
    		   Robot robot = new Robot();
    		  // robot.keyPress(KeyEvent.VK_F12);
    		   //robot.keyRelease(KeyEvent.VK_F12);
    		   
    		  // robot.mouseWheel(10);
    		   
    		   robot.mousePress(InputEvent.BUTTON1_MASK);

	}

}
