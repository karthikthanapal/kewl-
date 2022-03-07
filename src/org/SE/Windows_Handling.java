package org.SE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	
public static void main(String[] args) throws AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.yamaha-motor-india.com/");
	driver.manage().window().maximize();
	
	WebElement web = driver.findElement(By.xpath("//span[@class='nav__text']"));
	Actions act = new Actions(driver);
	act.contextClick(web).perform();
	
	Robot bot = new Robot();
	bot.keyPress(KeyEvent.VK_DOWN);
	bot.keyRelease(KeyEvent.VK_DOWN);
	
	bot.keyPress(KeyEvent.VK_DOWN);
	bot.keyRelease(KeyEvent.VK_DOWN);
	
	bot.keyPress(KeyEvent.VK_ENTER);
    	
	Set<String> handles = driver.getWindowHandles();
	ArrayList<String> less=new ArrayList<String>(handles);
	String title = driver.switchTo().window(less.get(0)).getTitle();
	System.out.println(title);
	
}
}
