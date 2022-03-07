package org.SE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {
	public static void main(String[] args)
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
		WebDriver access = new ChromeDriver();
		access.get("http://demo.automationtesting.in/Alerts.html");
		access.manage().window().maximize();
		access.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		access.switchTo().alert().accept();
		access.findElement(By.xpath("//a[@aria-expanded='true']")).click();
		
		
	
	}
		
	

}
