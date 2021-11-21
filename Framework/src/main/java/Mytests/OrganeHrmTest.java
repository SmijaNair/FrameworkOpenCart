package Mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrganeHrmTest extends BaseTest {
	
	@Test(priority=2)
	public void orangeHrmTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Sign Up for a Free HR Software Trial | OrangeHRM");
	}
	
	@Test(priority=3)
	public void orangeHrmUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("orange"));
	}
	
	@Test(priority=1)
	public void checkButton() {
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		WebElement button = driver.findElement(By.xpath("//a[text()='Get a Free Demo']"));
		Assert.assertTrue(button.isDisplayed());
	}
	

}
