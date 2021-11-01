package com.qa.opencart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.BrowserUtil;
import com.qa.opencart.utils.ElementUtil;

public class RegistrationPageTest {
	static WebDriver driver;


public static void main(String[] args) {
	
	ElementUtil eu = new ElementUtil(driver);
	BrowserUtil br = new BrowserUtil();
	driver = br.init_driver("chrome");
	br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
	By firstname = By.id("input-firstname");
	By lastname = By.id("input-lastname");
	By email = By.id("input-email");
	By telephone = By.id("input-telephone");
	By regPwd = By.id("input-password");
	By pwdconfirm = By.id("input-confirm");
	By checkbox=By.xpath("(//input[@type='radio'])[3]");
	eu.doSendKeys(firstname, "Neha");
	eu.doSendKeys(lastname, "Dhupia");
	eu.doSendKeys(email, "neha@gmail.com");
	eu.doSendKeys(regPwd, "test@123");
	eu.doSendKeys(pwdconfirm, "test@123");
	
	
	
}
	

}
