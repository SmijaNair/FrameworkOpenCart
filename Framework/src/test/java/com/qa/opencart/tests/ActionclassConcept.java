package com.qa.opencart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionclassConcept {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://mrbool.com/");
	Actions act = new Actions(driver);
	WebElement content=driver.findElement(By.xpath("//a[@class='menulink']"));
	act.moveToElement(content).perform();
	Thread.sleep(3000);
	WebElement course = driver.findElement(By.linkText("COURSES"));
	course.click();
	
}
}
