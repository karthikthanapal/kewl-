package org.SE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
		
		WebDriver name=new ChromeDriver();
		name.get("https://www.facebook.com/");
		name.manage().window().maximize();

		
		WebElement user = name.findElement(By.id("email"));
	    user.sendKeys("smith");
	    WebElement david = name.findElement(By.xpath("//input[@type='password']"));
	    david.sendKeys("123abc");
	    
			}

}
