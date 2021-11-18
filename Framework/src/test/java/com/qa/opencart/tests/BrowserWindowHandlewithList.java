package com.qa.opencart.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandlewithList {

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
	Set<String> handles = driver.getWindowHandles();
	List<String> handlesList = new ArrayList<String>(handles);
	String parentwindowId = handlesList.get(0);
	String childwindowId = handlesList.get(1);
	driver.switchTo().window(childwindowId);
	System.out.println(driver.getTitle());
	driver.switchTo().window(parentwindowId);
	System.out.println(driver.getTitle());
	
}

}
