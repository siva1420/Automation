package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");

		
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int size=selectable.size();
		System.out.println(size);
		
		Actions action= new Actions(driver);
		action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(2)).click(selectable.get(4)).build().perform();
	}

}
