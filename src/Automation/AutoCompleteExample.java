package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("a");
		Thread.sleep(4000);
		List<WebElement> ListOfOptions=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		System.out.println(ListOfOptions.size());
		
		for (WebElement webElement : ListOfOptions) {
			
			if(webElement.getText().equals("SOAP")) {
				webElement.click();
				break;
			}
			
			
		}

	}

}
