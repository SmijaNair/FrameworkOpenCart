package com.qa.opencart.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	//Totla no. of links and text of all links


public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total links is "+links.size());
	
	for(WebElement e : links) {
		if(!e.getText().isEmpty()) {
		System.out.println( e.getText());
	
		}
	}
}
}
