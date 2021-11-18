package com.qa.opencart.tests;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case2BrowserWindowHandle {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com");
	        driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
	        Set<String> handles =driver.getWindowHandles();
	        Iterator<String> it = handles.iterator();
	        String parentwindowId=it.next();
	        driver.switchTo().window(parentwindowId);
	        System.out.println("parent tile is "+driver.getTitle());
	        
	        String childwindowId=it.next();
	        driver.switchTo().window(childwindowId);
	        System.out.println("linkedin widnow is "+driver.getTitle());
	        driver.close();
	        driver.switchTo().window(parentwindowId);
	        driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
	        String fbId=it.next();
	        driver.switchTo().window(fbId);
	        System.out.println("fb widnow is "+driver.getTitle());
	       // driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
	      //  driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

	}

}
