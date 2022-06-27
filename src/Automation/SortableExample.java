package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");

		
		List<WebElement> sortableElement=driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		
		WebElement fromsortableElement=sortableElement.get(5);
		WebElement tosortableElement=sortableElement.get(1);
		
		Actions action=new Actions(driver);
		
		action.clickAndHold(fromsortableElement);
		action.moveToElement(tosortableElement);
		action.release(tosortableElement);
		action.build().perform();
		
	}

}
