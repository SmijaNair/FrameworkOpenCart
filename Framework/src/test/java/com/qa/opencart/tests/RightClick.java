package com.qa.opencart.tests;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	static WebDriver driver;
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightCllick=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightCllick).perform();
		By optionList = By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span");
		rightClickoptions(optionList,"Copy");
	
	
	}
	public static void rightClickoptions(By locator,String value) {
		System.out.println("gong to list");
		List<WebElement> options = driver.findElements(locator);		
		for(WebElement e:options) {
			String option = e.getText();
			if(option.equals(value)) {
				e.click();
				break;
			}
		}
	}


}
