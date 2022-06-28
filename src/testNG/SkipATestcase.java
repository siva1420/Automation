package testNG;

import org.testng.annotations.Test;

public class SkipATestcase {
	
	
	@Test(priority=0)
	public void Firsttestcase() {
		System.out.println("This is First Test Case");
	}
	
	@Test(priority=1)
	public void Secondtestcase() {
		System.out.println("This is Second Test Case");
	}
	
	@Test(priority=2, enabled=false)
	public void Thirdtestcase() {
		System.out.println("This is Third Test Case");
	}
	
	@Test(priority=3)
	public void Fourthtestcase() {
		System.out.println("This is Fourth Test Case");
	}
	
	@Test(priority=4)
	public void Fifthtestcase() {
		System.out.println("This is Fifth Test Case");
	}

}
