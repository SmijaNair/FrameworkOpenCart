package com.qa.opencart.utils;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
			if(!e.getText().isEmpty()) {
			eleTextList.add(e.getText());
			
			}
			
		}
		return eleTextList;
	}
	
	public void doSelectDropDownValueByIndex(By locator, int index) {
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}
	
	public void doSelectDropDownValueByVisibleText(By locator, String text) {
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(text);
	}
	public void doSelectDropDownValueByValue(By locator, String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(value);
	}
	
	public void doSelectDropDownValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for(WebElement e:optionsList) {
			if(e.getText().equals(value)) {
				e.click();
				break;
			}
			System.out.println(e.getText());
		}
	}
	
	public void doSelectDropDownValueWithoutSelect(By locator,String value) {
		//List<WebElement> list = driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
		List<WebElement> list = getElements(locator);
		for(WebElement e:list) {
			if(e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}
}
