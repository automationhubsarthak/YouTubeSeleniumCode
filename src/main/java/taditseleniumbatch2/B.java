package taditseleniumbatch2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class B extends A{
	
	@Test
	public static void loginPage() {
		driver.findElement(By.className("signin")).click();
	}

}
