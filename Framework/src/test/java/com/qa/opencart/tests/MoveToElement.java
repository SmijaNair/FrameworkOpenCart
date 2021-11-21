package com.qa.opencart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://mrbool.com/");
	Actions act = new Actions(driver);
//	WebElement content=driver.findElement(By.xpath("//a[@class='menulink']"));
//	act.moveToElement(content).perform();
	Thread.sleep(3000);
	
	doActionMoveToElement(By.className("menulink"));
	Thread.sleep(3000);
	doActionMoveToElementandClick(By.linkText("COURSES"));
//	WebElement course = driver.findElement(By.linkText("COURSES"));
//	course.click();
	
}
public static WebElement getElement(By locator) {
	return driver.findElement(locator);
	
	}

public static void doActionMoveToElement(By locator) {
	Actions act = new Actions(driver);
	act.moveToElement(getElement(locator)).perform();
	
}

public static void doActionMoveToElementandClick(By locator) {
	doActionMoveToElement(locator);
	getElement(locator).click();
	
}
}
