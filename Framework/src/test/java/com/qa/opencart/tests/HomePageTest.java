package com.qa.opencart.tests;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.opencart.utils.BrowserUtil;
import com.qa.opencart.utils.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {
	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("chrome");
		//br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		br.launchUrl("https://www.amazon.in/");

		System.out.println(br.getPageTitle());
		System.out.println(br.getPageUrl());
		
		By emailid = By.id("input-email");
		By pwd = By.id("input-password");
		By register = By.xpath("(//a[contains(text(),'Register')])[2]");
		By links = By.tagName("a");
		
		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emailid, "smija@gmail.com");
//		eleUtil.doSendKeys(pwd, "test@123");
//		eleUtil.doClick(register);
				eleUtil.getElements(links);
				List<String> linksTextLink= eleUtil.getElementsTextList(links);
				for(String e: linksTextLink) {
					System.out.println(e);
				}
	}

}
