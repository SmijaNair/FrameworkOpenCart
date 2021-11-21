package com.qa.opencart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSendKeysAndClickConcept {
	 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/login");
		 
		 By emailId=By.id("input-email");
		 By password=By.id("input-password");
		 By login=By.xpath("//input[@type='submit' and @value='Login']");
		 
//		 WebElement emailEle = driver.findElement(emailId);
//		 WebElement passEle = driver.findElement(password);
//		 WebElement logniEle = driver.findElement(login);
		 
//		 Actions act = new Actions(driver);
//		 act.sendKeys(emailEle,"naveenanimation20@gmail.com").perform();
//		 act.sendKeys(passEle,"test123").perform();
//		 act.click(logniEle).perform();
		 
		 doActionSendKeys(emailId,"naveen@gmail.com");
		 doActionSendKeys(password,"helo");
		 doActionClick(login);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionSendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();
	}
	public static void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
}
