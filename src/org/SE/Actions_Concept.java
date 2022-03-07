package org.SE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Concept {
	    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement hello = driver.findElement(By.xpath("//a[@data-nav-role='signin']"));
		Actions web = new Actions(driver);
		web.moveToElement(hello).perform();
		
		//right click
		
		WebElement find= driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
		Actions pop=new Actions(driver);
		pop.contextClick(find).perform();

		
		//Drag&Drop
		
		driver.navigate().to("https://demoqa.com/droppable/");
	    WebElement drag = driver.findElement(By.id("draggable"));
	    WebElement drop = driver.findElement(By.id("droppable"));
	    
	    Actions loop = new Actions(driver);
	    loop.dragAndDrop(drag, drop).perform();
	}

}
