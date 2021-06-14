package easemytrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Logout_EaseMyTrip {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		System.out.println(driver.getTitle());

		Actions action= new Actions(driver);
		WebElement myAccount= driver.findElement(By.xpath("//span[@id='spnMyAcc']"));
		action.moveToElement(myAccount).build().perform();
		System.out.println("Mouse hovering on My Account");
		driver.findElement(By.xpath("//div[@class='signup_pnl']/child::a[@class='btn_signin']")).click();
		driver.findElement(By.xpath("//input[@id='txtusername']")).sendKeys("8327752761");
		driver.findElement(By.xpath("//input[@id='Password1']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='Password1']/parent::div/following-sibling::div[@class='sign-inn']/child::input[@class='buttonLogin']")).click();
		WebElement displayTest=driver.findElement(By.xpath("//h1[text()='Search Lowest Airfare']"));

		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(displayTest));
		WebElement logOut1=driver.findElement(By.xpath("//span[@id='spnLgnWelcome']/following::i[1]"));
		action.moveToElement(logOut1).build().perform();
		driver.findElement(By.xpath("//span[@id='spnLogoutPnl']/child::a[2]")).click();
		driver.switchTo().alert().accept();
		System.out.println("Done!!!!!!!");
		driver.close();

	}

}
