package browser_options;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox_Options {
public static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"C:\\temp\\logs.txt");
	//Firefox Profiling
	//Step 1 - close the firefox browser from Exit menu 
	//Step 2 - Open Windows+R and type the following command  firefox.exe -p profilemanager
	//Step 3 - Create your own firefox profile
	
	FirefoxOptions options = new FirefoxOptions();
	ProfilesIni profini = new ProfilesIni(); //you have to create object of ProfilesIni class. It represents all the profiles in your machine
	FirefoxProfile prof = profini.getProfile("Automation_Hub");
	options.setProfile(prof);
	
	//PageLoadStrategy
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	
	//Notofications
	prof.setPreference("dom.webnotifications.enabled", false);
	
	//Proxy Servers
	//prof.setPreference("netowrk.proxy.type", 1);
	//prof.setPreference("network.proxy.socks", "192.217.63.1");
	//prof.setPreference("network.proxy.socks_port", 4343);
	
	//Certificates and certificate errors
	prof.setAcceptUntrustedCertificates(true);
	prof.setAssumeUntrustedCertificateIssuer(false);
	
	driver = new FirefoxDriver(options);
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123");

	}

}
