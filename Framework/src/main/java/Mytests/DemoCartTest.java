package Mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoCartTest extends BaseTest {
	
	
	@Test(priority=2)
	public void demoCartTitleTest() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test(priority=3)
	public void demoCartUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}
	

	

}
