package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetWindowPosition;

import com.sun.jna.platform.win32.WinDef.POINT;

public class ButtonExample {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/img")).click();
		
		
		WebElement Position=driver.findElement(By.id("position"));
		Point xypoint= Position.getLocation();
		int xvalue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("X value is :"+xvalue + "Y Value is:"+yvalue);
		
		
		WebElement colorButton=driver.findElement(By.id("color"));
		String color=colorButton.getCssValue("background-color");
		System.out.println("Button color is:"+ color);
		
		
		WebElement sizeButton=driver.findElement(By.id("size"));
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		System.out.println("Height is:"+height + "Width is:"+ width);
		
		
		WebElement gohome= driver.findElement(By.id("home"));
		gohome.click();
		
		
	}

}
