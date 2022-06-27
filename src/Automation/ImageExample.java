package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		
		WebElement firstimage= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		firstimage.click();
		
		Thread.sleep(4000);
		
		driver.get("http://www.leafground.com/pages/Image.html");
		
		
		WebElement BrokenImage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		if(BrokenImage.getAttribute("naturalWidth").equals("0")){
			System.out.println("This image is broken");
		}else {
			System.out.println("This Image is not broken");
		}
		
		
		
	}

}
