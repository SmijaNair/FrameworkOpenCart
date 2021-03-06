package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//private By locators
	private WebDriver driver;
	
	private By username = By.id("input-email");
	private By password=By.id("input-password");
	private By loginButton = By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.xpath("(//a[text()='Forgotten Password'])[1]");
	
	//Constructors of page classs
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	//3. Page Actions
	
	public String getLoginPageTitle() {
		String title =driver.getTitle();
		return title;
	}
	public String getLoginPageUrl() {
		return driver.getCurrentUrl();
	}
	public boolean isForgottenPwdDisplayed() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	public void login(String un, String pwd) {
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
	}
}
