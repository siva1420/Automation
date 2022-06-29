package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	//Aim: Open Chrome and go to 
	//1. Open google, 2. Open Bing and 3. Open Youtube

	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;

	@BeforeSuite
	public void openbrowser() {
		starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\grid\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
	}

	@Test
	public void openGoogle() {
		driver.get("http://www.google.com");
	}

	@Test
	public void openBing() {
		driver.get("http://www.bing.com");
	}

	@Test
	public void openYouTube() {
		driver.get("http://www.YouTube.com");
	}

	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endtime=System.currentTimeMillis();
		totaltime=endtime-starttime;
		System.out.println("Total time Take :"+ totaltime);
	}

}
