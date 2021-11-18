package com.qa.opencart.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleSearc {
	public static WebDriver driver;
	public static void main(StringQuestion[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("testing");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span"));	
		for(WebElement e:options) {
			System.out.println(e.getText());
			if(e.getText().equals("testing interview questions"))
			{
				e.click();
			    break;
		}
		//driver.quit();
	}
	}
}
