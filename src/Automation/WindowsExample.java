package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		//to open home page
		WebElement OpenHomePage=driver.findElement(By.id("home"));
		String ParentWindow=driver.getWindowHandle();
		OpenHomePage.click();
		
		Set<String> Childwindow=driver.getWindowHandles();
		
		for (String NewWindow : Childwindow) {
			driver.switchTo().window(NewWindow);
			}
		WebElement EditTheNewWindow=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
		EditTheNewWindow.click();
		WebElement editBox=driver.findElement(By.id("email"));
		editBox.sendKeys("SS@gmail.com");
		driver.close();
		
		//return back to parent window
		driver.switchTo().window(ParentWindow);
		
		//open the no.of windows and its size
		WebElement OpenMultipleWindow=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		OpenMultipleWindow.click();
		int NumberofWindows=driver.getWindowHandles().size();
		System.out.println("Number of Windows Opened :" + NumberofWindows);
		
		//close all child window except parent window
		WebElement doNotCloseMe=driver.findElement(By.id("color"));
		doNotCloseMe.click();
		
		Set<String> NewWindowHandles=driver.getWindowHandles();
		for (String allwindow : NewWindowHandles){
			if(!allwindow.equals(ParentWindow));
			driver.switchTo().window(allwindow);
			driver.close();
			
		}
	

	}

}
