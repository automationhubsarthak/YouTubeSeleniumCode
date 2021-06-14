package junitpackage;

import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Browser {
	
	@Test
	public void OpenBrowser() {
		System.out.println("Browser Opens");
	}

	 @Test
	 public void MaximizeBrowser() {
		 System.out.println("Browser Maximizes");
	 }
	 
	 @Test
	 public void EnterURL() {
		 System.out.println("Enters URL in browser");
	 }
	 
	 //@Ignore
	 @Test
	 public void CloseBrowser() {
		 Assume.assumeTrue(false);
		 System.out.println("Closes Browser");
	 }
}
