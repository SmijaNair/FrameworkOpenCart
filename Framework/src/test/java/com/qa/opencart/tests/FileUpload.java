package com.qa.opencart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
public static void main(StringQuestion[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("/Users/smijau/Documents/Social_IntegrationViewability/STORAGE/SI-FB/03-11-2021/11032021_TC_001/facebook.log");
}
}
