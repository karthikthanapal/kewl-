package org.SE;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_Concept {
	
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	
	//Right click - Mouse Hover
	
	Thread.sleep(2000);
    WebElement element = driver.findElement(By.xpath("//a[@_sp='p2481888.m1379.l3250']"));
    Actions act=new Actions(driver);
    act.contextClick(element).perform();
    
    //keyboard actions
    
    Robot bot = new Robot();
    
    bot.keyPress(KeyEvent.VK_DOWN);
    bot.keyRelease(KeyEvent.VK_DOWN);
    
    bot.keyPress(KeyEvent.VK_DOWN);
    bot.keyRelease(KeyEvent.VK_DOWN);
    
    bot.keyPress(KeyEvent.VK_DOWN);
    bot.keyRelease(KeyEvent.VK_DOWN);
    
    bot.keyPress(KeyEvent.VK_DOWN);
    bot.keyRelease(KeyEvent.VK_ENTER);
    
	}

}
