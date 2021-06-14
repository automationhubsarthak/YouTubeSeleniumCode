package mouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Demo {
	public static WebDriver driver;
	
public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		//Step 1 - we have to create the object of the Actions class
		//Step 2 - we have to pass the driver reference in the constructor
		Actions actions = new Actions(driver);
		//WebElement specifiedtarget = driver.findElement(By.id("spnMyAcc"));
	    //actions.moveToElement(specifiedtarget).perform();
	  
	     //another example - of dragging - https://jqueryui.com/draggable/
		//id = draggable
		
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames :" + totalframes.size());
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		//WebElement target = driver.findElement(By.id("droppable"));
		
	   // actions.dragAndDrop(source, target).perform();
		actions.dragAndDropBy(source, 200, 200).perform();
	    
	   // actions.clickAndHold(source).moveToElement(target).perform();
	    
		driver.switchTo().defaultContent();
		
	

	}

}
