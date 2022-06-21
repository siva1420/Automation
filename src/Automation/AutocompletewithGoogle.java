package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompletewithGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement input=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		input.sendKeys("y");
		Thread.sleep(4000);
		
		List<WebElement> listOfOption=driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li"));
		
		
		System.out.println(listOfOption.size());
		
		for (WebElement webElement : listOfOption) {
			
			if(webElement.getText().equals("YouTube")) {
				webElement.click();
				break;
			}
			
			List<WebElement> selectoption= driver.findElements(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/div/cite"));
			
			
			
		for (WebElement webElement2 : selectoption) {
			
			if(webElement2.getText().equals("https://www.youtube.com")) {
				webElement2.click();
				break;
			}
			
		}
		
	 
		}
		
		
			
		

	}

}
