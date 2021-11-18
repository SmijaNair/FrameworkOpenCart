package com.qa.opencart.tests;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1BrowserWindowHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
        Set<String> handles =driver.getWindowHandles();
        Iterator<String> it = handles.iterator();

        String parentWindowId=it.next();
        System.out.println("parent window id is "+parentWindowId);
        driver.switchTo().window(parentWindowId);
        System.out.println("parent window titel is "+driver.getTitle());
        String linkedin=it.next();
        driver.switchTo().window(linkedin);
        System.out.println("Linked in url "+driver.getTitle());
        System.out.println("linkedin window id is "+linkedin);
        String facebook = it.next();
        System.out.println("facebook window id is "+facebook);
        String twitter = it.next();
        System.out.println("twitter window id is "+twitter);
        String youtube=it.next();       
        System.out.println("youtube window id is "+youtube);
    }
}
