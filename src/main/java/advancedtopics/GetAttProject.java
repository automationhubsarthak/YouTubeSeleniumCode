package advancedtopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttProject {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.impactecs.com");
		driver.findElement(By.name("UserName")).sendKeys("sarthak@impactecs.com");
		driver.findElement(By.name("Password")).sendKeys("Romeo@123#");
		driver.findElement(By.className("dx-button-content")).click();
		
		driver.navigate().to("https://test.impactecs.com/FormsAndScriptsTest/Folder?nav=folders&folder=6&itemType=ScriptModule&display=Script%20Modules");
	     Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		  wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(), 'OpenItemInNewWindow')]")));
		 driver.findElement(By.xpath("//a[contains(text(), 'OpenItemInNewWindow')]")).click();
		
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id = 'topBarDivButtons']/child::div[1]/following-sibling::div[4]/descendant::span[1]")));
		driver.findElement(By.xpath("//div[@id = 'topBarDivButtons']/child::div[1]/following-sibling::div[4]/descendant::span[1]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id = 'functionDialogBox']/descendant::button[@id = 'okButton']")));
		driver.findElement(By.xpath("//div[@id = 'functionDialogBox']/descendant::button[@id = 'okButton']")).click();
		System.out.println("OK button is getting clicked");
		
		String mainWindow=driver.getWindowHandle();
		Set<String> set =driver.getWindowHandles();
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			String childWindow=itr.next();
			if(!mainWindow.equals(childWindow)){
			driver.switchTo().window(childWindow);
			System.out.println(driver.switchTo().window(childWindow).getTitle());
			driver.close();
			}
		}
		
		driver.switchTo().window(mainWindow);
		
	}

}
