import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox_Options {

	public static void main(String[] args) {
		
		FirefoxOptions options = new FirefoxOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		//Profiling in Firefox
		//To use profiling we have to close Firefox from File>Exit
		// go to run and type the command firefox.exe -p profilemanager
		
		WebDriver driver = new FirefoxDriver(options);
		
		

	}

}
