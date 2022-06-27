package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class LinkExtendedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement GoToHome=driver.findElement(By.linkText("Go to Home Page"));
		GoToHome.click();
		
		driver.navigate().back();
		
		WebElement FindwhereToGo=driver.findElement(By.partialLinkText("Find where"));
		String where=FindwhereToGo.getAttribute("href");
		System.out.println("This Link Is Going To :" + where);
		
		WebElement BrokenLinks=driver.findElement(By.linkText("Verify am I broken?"));
		BrokenLinks.click();
		String title=driver.getTitle();
		if(title.contains("404")) {
			System.out.println("This Link is Broken");
		}
		 
		driver.navigate().back();
		
		WebElement GoToHome1=driver.findElement(By.linkText("Go to Home Page"));
		GoToHome1.click();
		
		driver.navigate().back();
		
		List<WebElement> LinkCount=driver.findElements(By.tagName("a"));
		int count=LinkCount.size();
		System.out.println("Total Link is:"+ count);
		

	}

}
