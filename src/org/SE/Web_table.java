package org.SE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");

Thread.sleep(2000);
WebDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/html/html_tables.asp");
driver.manage().window().maximize();
 
List<WebElement> find = driver.findElements(By.id("customers"));
for (WebElement Element : find) {
System.out.println(Element.getText());
}
		
List<WebElement> fin = driver.findElements(By.xpath("(//table[@class='ws-table-all'])/table/tr[4]"));		
		for (WebElement webE : fin) {
			System.out.println(webE.getText());
		}
		
		
		
	}

}
