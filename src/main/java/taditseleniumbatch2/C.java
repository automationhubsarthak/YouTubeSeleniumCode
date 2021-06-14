package taditseleniumbatch2;

import org.testng.annotations.Test;

public class C extends A{

	@Test
	public void tearDown() {
		driver.close();
	}
}
