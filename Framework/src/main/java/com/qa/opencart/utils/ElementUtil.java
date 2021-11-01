package com.qa.opencart.utils;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	//Never create ur driver as static inside the utility
	 WebDriver driver;
	public ElementUtil(WebDriver driver) {
	this.driver=driver;
	}
	
	
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
		
		}
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	//parallel testing is not possible if we use static for these methods.
	public  void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public void doClick(By locator) {
		getElement(locator).click();
	}
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public Boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	
	public List<String> getElementsTextList(By locator) {
		List <WebElement> eleList = getElements(locator);
		List<String> eleTextList= new ArrayList<String>();
		for(WebElement e : eleList) {
			if(!eleTextList.isEmpty()) {
			eleTextList.add(e.getText());}
		}
		return eleTextList;
	}
	
	
}
