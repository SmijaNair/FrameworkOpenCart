package com.qa.opencart.tests;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case2BrowserWindowHandle {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com");
	       WebElement linkedin = driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
	       WebElement facebook = driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));
	       WebElement twitter =  driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']"));
	       WebElement youtube = driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']"));
	       
	       linkedin.click();
	       Set<String>handles = driver.getWindowHandles();
	       Iterator<String> it = handles.iterator();
	       String parent=it.next();
	       String linkedinhandle=it.next();
	       driver.switchTo().window(linkedinhandle);
	       System.out.println("linked in title is "+driver.getTitle());
	       driver.close();
	       driver.switchTo().window(parent);
	       
	       facebook.click();
	       Set<String>handles2 = driver.getWindowHandles();
	       Iterator<String> it2 = handles2.iterator();
	       String parent2=it2.next();
	       String facebookhandle = it2.next();
	       driver.switchTo().window(facebookhandle);
	       System.out.println("facebook title is "+driver.getTitle());
	       driver.close();
	       driver.switchTo().window(parent);
	}

}
