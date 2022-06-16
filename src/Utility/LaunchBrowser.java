package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		//saying which browser and its location
		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		
		//Getting new chrome browser
		WebDriver driver= new ChromeDriver();
		
		//saying to browser that get the mention website
		driver.get("http://www.leafground.com/");
		
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img")).click();
		
		WebElement emailbox=driver.findElement(By.id("email"));
		emailbox.sendKeys("ss@gmail.com");
		
		WebElement appendbax=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendbax.sendKeys("Sivathanu");
		
		WebElement defaultbox=driver.findElement(By.name("username"));
		String value=defaultbox.getAttribute("value");
		System.out.println(value);
		
		WebElement clearbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearbox.clear();
		
		

	}

}
