package com.qa.opencart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.get("https://artoftesting.com/sampleSiteForSelenium");
		 Thread.sleep(5000);
		 Actions act = new Actions(driver);
		 act.doubleClick(driver.findElement(By.id("dblClkBtn"))).perform();
	}

}
