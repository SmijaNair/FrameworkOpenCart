package Mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amazonTest extends BaseTest{
	
	@Test(priority=2)
	public void demoCartTitleTest() {
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Online"));
	}
	
	@Test(priority=3)
	public void amazonLogoTest() {
		
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}
	

	

}
