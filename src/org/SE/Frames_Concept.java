package org.SE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Concept {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demo.automationtesting.in/Frames.html");
driver.manage().window().maximize();
WebElement findElement = driver.findElement(By.id("singleframe"));
driver.switchTo().frame(findElement);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("karthik");
driver.switchTo().defaultContent();



	
	
	
	
	
	




}	

}
