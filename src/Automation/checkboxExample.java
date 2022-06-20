package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement languageknown1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		languageknown1.click();
		WebElement languageknown2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[3]"));
		languageknown2.click();
		WebElement languageknown3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[5]"));
		languageknown3.click();
		
		
		WebElement confirmchecked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		boolean status1=confirmchecked.isSelected();
		System.out.println(status1);
		
		
		WebElement deselect1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		
		if(deselect1.isSelected()) {
			deselect1.click();
		}
		
		WebElement deselect2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		if(deselect2.isSelected()) {
		deselect2.click();
		}
		
		
		WebElement selectoption1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[1]"));
		selectoption1.click();
		
		WebElement selectoption2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[2]"));
		selectoption2.click();
		
		WebElement selectoption3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[3]"));
		selectoption3.click();
		
		WebElement selectoption4=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[4]"));
		selectoption4.click();
		
		WebElement selectoption5=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[5]"));
		selectoption5.click();
		
		WebElement selectoption6=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[6]"));
		selectoption6.click();
		
	

	}

}
