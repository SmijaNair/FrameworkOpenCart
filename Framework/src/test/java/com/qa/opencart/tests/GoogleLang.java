package com.qa.opencart.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLang {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		List<WebElement> langLink = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println("Total lang link is "+langLink.size());
		
		for(WebElement e : langLink) {
			if(e.getText().equals("മലയാളം"))
			{
				e.click();
				break;
			}
		}
		
	}

}
