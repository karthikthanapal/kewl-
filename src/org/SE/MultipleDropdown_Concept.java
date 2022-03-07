package org.SE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown_Concept {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
driver.manage().window().maximize();
WebElement element = driver.findElement(By.id("multi-select"));
Select key = new Select(element);
boolean multiple = key.isMultiple();
System.out.println("multiple dropdown "+multiple);

List<WebElement> options = key.getOptions();
for (WebElement webElement : options) {
	System.out.println(webElement.getText());
}	
int size = options.size();
System.out.println(size);
for (int i = 0; i <size; i++) {
	if (i==1||i==6) {
		key.selectByIndex(i);		
		
	}
}
List<WebElement> list = key.getAllSelectedOptions();
for (WebElement web : list) {
	System.out.println(web.getText());	
}

WebElement firstSelectedOption = key.getFirstSelectedOption();
System.out.println(firstSelectedOption.getText());

	}

}
