package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	/*Scenario: A big Basket having different kind of mobiles.
	Let us say there are Apple phones, vivo, nokia,and samsung
	I want to run the test for only apple and samsung. write the program for that*/

	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Apple1 Mobile Testing");
	}
	
	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("Apple2 Mobile Testing");
	}
	
	@Test(groups= {"Vivo"})
	public void vivo1() {
		System.out.println("VIVO1 Mobile Testing");
	}
	
	@Test(groups= {"Vivo"})
	public void vivo2() {
		System.out.println("VIVO2 Mobile Testing");
	}
	
	@Test(groups= {"Nokia"})
	public void nokia1() {
		System.out.println("Nokia1 Mobile Testing");
	}
	
	@Test(groups= {"Nokia"})
	public void nokia2() {
		System.out.println("Nokia2 Mobile Testing");
	}
	
	@Test(groups= {"Samsung"})
	public void samsung1() {
		System.out.println("Samsung1 Mobile Testing");
	}
	
	@Test(groups= {"Samsung"})
	public void samsung2() {
		System.out.println("Samsung2 Mobile Testing");
	}
}
