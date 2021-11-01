package com.qa.opencart.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		Select sel_country = new Select(country);
		sel_country.selectByVisibleText("Brunei Darussalam");
		List<WebElement> countryList = sel_country.getOptions();
		for(WebElement e:countryList) {
			if(e.getText().equals("Algeria")) {
				e.click();
			}
			System.out.println(e.getText());
		}
	}

}
