package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class_Mouse {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Actions actions = new Actions(driver);
		
		//Right click - ContextClick();
		
		//WebElement signinlink = driver.findElement(By.className("signin"));
		//actions.moveToElement(signinlink).contextClick().perform();
		//actions.contextClick(signinlink).perform();
		
		//Double click - doubleClick();
		
	    //Tooltip - how to retrieve tool tip in Selenium
		//1st way = using getAttribute() method in case the tool tip is present in the title of the DOM when the element is inspected
		
		//String signintooltiptext = signinlink.getAttribute("Already a user? Sign in");
		/*
		 * if(signintooltiptext.equals("Already a user? Sign in")) {
		 * System.out.println("PASS"); }else {
		 * System.out.println("FAIL : Tooltip is not matching"); }
		 */
		
		//2nd Way = using Actions class
		
		WebElement CreateAccountLink = driver.findElement(By.xpath("//p[@id = 'signin_info']/child::a[2]"));
		actions.moveToElement(CreateAccountLink).perform();
		
	 String Tooltiptext = CreateAccountLink.getText();
	 System.out.println("Text of CreateAccountLink tooltip is :" + Tooltiptext );

	}

}
