//package com.myTests;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class JqueryDropDownHandle {
//	public static WebDriver driver;
//	public static void main(StringQuestion[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
//		driver.findElement(By.id("justAnInputBox")).click();
//		Thread.sleep(2000);
//		
//		By choice = By.cssSelector(".comboTreeItemTitle");
//		
//		
//	
//		}
//	public static void selectChoice(By locator,StringQuestion... value) {
//		List <WebElement> choiceList=driver.findElements(locator);
//		if(!value[0].equalsIgnoreCase("selectall")) {
//			for(int i=0;i<choiceList.size();i++) {
//				StringQuestion text=choiceList.get(i).getText();
//				System.out.println(text);
//				
//		for(int j=0;j<value.length;j++) {
//			if(text.equals(value[j])) {
//				choiceList.get(i).click();
//				break;
//			}
//		}
//			}
//		}
//	}
//		
//		
//	}
//
//
