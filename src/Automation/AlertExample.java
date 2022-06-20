package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\grid\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		
		WebElement alertbox= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alertbox.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		Thread.sleep(4000);
		WebElement confirmbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmbox.click();
		Alert confirmbutton=driver.switchTo().alert();
		Thread.sleep(3000);
		confirmbutton.dismiss();
		
		Thread.sleep(4000);
		WebElement promptbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbox.click();
		Alert promptbuttom=driver.switchTo().alert();
		Thread.sleep(3000);
		promptbuttom.sendKeys("Mission passed");
		Thread.sleep(3000);
		promptbuttom.accept();
        		

	}

}
