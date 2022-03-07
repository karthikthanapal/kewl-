package org.SE;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Concept {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		TakesScreenshot snap = (TakesScreenshot) driver;
		File screenshotAs = snap.getScreenshotAs(OutputType.FILE);
		File name = new File("C:\\Users\\karth\\eclipse-workspace\\Selenium\\Screenshot\\snap.png");
		FileUtils.copyFile(screenshotAs, name);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
