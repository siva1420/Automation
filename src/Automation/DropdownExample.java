package Automation;

 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/h5")).click();
		
	/*	WebElement dropdown1= driver.findElement(By.id("dropdown1"));
		Select select= new Select(dropdown1);
		select.selectByIndex(2);
*/		
		WebElement dropdown2= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/select"));
		Select text=new Select(dropdown2);
	    Select.
	    
	    
		driver.findElement(By.id("dropdown3"));
		//Select Value= new Select(dropdown3);
		select.selectByValue("2");
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		List<WebElement> listOfOption=select.getOptions();
		int size=listOfOption.size();
		System.out.println("Number of element is :"+size);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[1]"));
	
	}
	

}
