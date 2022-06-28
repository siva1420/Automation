package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
	
	@Test(enabled=true)
	public void highschool() {
		System.out.println("High School");
		
	}
	
	@Test(dependsOnMethods="highschool")
	public void highersecondary() {
		System.out.println("Higher Sec School");
		
	}
	
	@Test(dependsOnMethods="highersecondary")
	public void engineering() {
		System.out.println("College");
		
	}

}
