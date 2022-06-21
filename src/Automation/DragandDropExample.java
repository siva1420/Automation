package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\grid\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement dragme=driver.findElement(By.id("draggable"));
		WebElement drophere=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		/*action.clickAndHold(dragme);
		action.moveToElement(drophere).release(drophere).build().perform();*/
		
		//another simple method for drag and drop
		
	action.dragAndDrop(dragme, drophere).build().perform();

	}

}
