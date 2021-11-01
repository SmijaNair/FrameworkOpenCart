package com.qa.opencart.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownwithoutselectclass {
	public static void main(String[] args) {
		
		//Select value from dropdown without using Select class
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		List<WebElement> list = driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
		for(WebElement e:list) {
			if(e.getText().equals("Tokelau")) {
				e.click();
				break;
			}
		}
		
	}

}
