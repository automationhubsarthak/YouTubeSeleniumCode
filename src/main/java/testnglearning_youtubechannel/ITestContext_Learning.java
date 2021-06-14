package testnglearning_youtubechannel;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITestContext_Learning {
	//ItestContext is an interface. used in TestNG. It helps to share data within the test-cases which are in a single Java file or in the same class
	
	@Test(priority = 1)
	public void SwitchON(ITestContext context) {
	System.out.println("Laptop is switched ON");	
	context.setAttribute("LaptopName", "DELL");
	}
	
	@Test(priority = 2, dependsOnMethods = "SwitchON")
	public void Operating(ITestContext context) {
		System.out.println("Laptop is Running");
		String LaptopBrand = (String)context.getAttribute("LaptopName");
		System.out.println("The name of the brand is :" + LaptopBrand);
		context.setAttribute("LaptopSpeed", "VeryFast");
	}

	 @Test(priority = 3, dependsOnMethods = {"SwitchON" , "Operating"})
	 public void SwitchOff(ITestContext context) {
		System.out.println("Laptop has been switched off"); 
		String LaptopPerformance = (String)context.getAttribute("LaptopSpeed");
		System.out.println("The performance os the laptop even to initiate SwitchOFF is : " + LaptopPerformance);
	 }
}
