package com.qa.opencart.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total links is "+images.size());
		
		for(WebElement e : images) {
			if(!e.getAttribute("alt").isEmpty()) {
			System.out.println( e.getAttribute("src")+"-->"+e.getAttribute("alt"));
			}
				
		}
		driver.quit();
	}

}
