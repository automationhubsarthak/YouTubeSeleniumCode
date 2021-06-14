package testng_cmegroup;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Complete_TestNG_Features {
	 
	@BeforeTest
	    public void initialize(){
	        System.out.println("Launch the URL");
	    }
	
	    @Test(priority = 1, enabled = true )
	    public void RegistrationPage(){
	        System.out.println("Registration Page");  
	      //  Assert.fail("I am deliberately failing RegistrationPage TestCase");
	    }

	    @Test(priority = 2, alwaysRun = true, dependsOnMethods = "RegistrationPage", invocationCount = 10, invocationTimeOut = 1000) 
	    public void Login(){
	        System.out.println("Login Page");
	    }

	    @Test(priority = 3, alwaysRun = true, dependsOnMethods = {"RegistrationPage" , "Login"})
	    public void HomePage(){
	        System.out.println("Home Page");
	    }

	    @Test(priority = 4, alwaysRun = true, dependsOnMethods = {"RegistrationPage" , "Login" , "HomePage"})
	    public void LogOut(){
	        System.out.println("LogOut link");
	    }

	    @AfterTest
	    public void tearDown(){
	        System.out.println("Close the Browser");
	    }
	}