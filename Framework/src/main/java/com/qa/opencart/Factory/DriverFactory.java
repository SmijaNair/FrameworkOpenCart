package com.qa.opencart.Factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author smijau
 *
 */
public class DriverFactory {
WebDriver driver;
/**
 * This method will return webdriver
 * @param browserName
 * @return
 */

public WebDriver init_driver(String browserName) {
	System.out.println("browsernme is "+browserName);
	
	if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else if (browserName.equalsIgnoreCase("safari")) {
		driver= new SafariDriver();
	}
	else
		System.out.println("Please pass the correct browser "+browserName);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demo.opencart.com/");
	
	return driver;
}

/**
 * This method will return Properties object
 * @return
 */

public Properties init_prop() {
	Properties prop = new Properties();
	try {
		FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		System.out.println("Filenotfound exception");
		e.printStackTrace();
	} catch (IOException e) {
		System.out.println("IOExcpetion");
		e.printStackTrace();
	}
	return prop;
}

}
