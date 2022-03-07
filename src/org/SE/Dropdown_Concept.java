package org.SE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Concept {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

Thread.sleep(2000);		
driver.findElement(By.xpath("//input[@tabindex='0']")).sendKeys("karthik");
Thread.sleep(2000);
WebElement ht= driver.findElement(By.xpath("//input[@name='lastname']"));
ht.sendKeys("thanapal");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("karthikthanapal@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("karthikthanapal@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("kar@123");


Thread.sleep(2000);
WebElement find = driver.findElement(By.id("day"));
Select k = new Select(find);
k.selectByIndex(28);

Thread.sleep(2000);
WebElement show = driver.findElement(By.id("month"));
Select kk = new Select(show);
kk.selectByValue("3");


Thread.sleep(2000);
WebElement declare = driver.findElement(By.id("year"));
Select kkk = new Select(declare);
kkk.selectByVisibleText("1993");

Thread.sleep(1000);
driver.findElement(By.xpath("//input[@value='2']")).click();

Thread.sleep(1000);
driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();

}		
}
