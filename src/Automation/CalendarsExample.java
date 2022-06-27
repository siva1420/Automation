package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\grid\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		//first method
		/*WebElement calendar=driver.findElement(By.id("datepicker"));
		calendar.sendKeys("07/10/2022"+Keys.ENTER);*/
		
		//second method
		WebElement calendar=driver.findElement(By.id("datepicker"));
		calendar.click();
		
		WebElement nextbutton=driver.findElement(By.xpath("//a[@title='Next']"));
		nextbutton.click();
		
		WebElement dateselection=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[1]/a"));
		dateselection.click();
		
		
		
		

	}

}
