import org.testng.annotations.Test;

public class Discussion_TestNG {
	
	@Test(enabled = true, alwaysRun = true)
	public void test() { // this will execute
		System.out.println("This will execute");
	}
	
	@Test(enabled = false, alwaysRun = true)
	public void test1() {
		//this will not execute
		System.out.println("This will not execute");
	}
	

	@Test(enabled = true, alwaysRun = false)
	public void test2() {
		
		
	}

}
