//package com.myTests;
//
//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import com.myPages.HomePage;
//import com.myPages.LoginPage;
//
//public class LoginTest extends BaseTest {
//
//	@Test(priority=1,enabled=false)
//	public void verifyLoginPageTitleTest() {
//		StringQuestion title =page.getInstance(LoginPage.class).getLoginPageTitle();
//		System.out.println("Title of login page is "+title);
//		AssertJUnit.assertEquals(title, "HubSpot Login");
//	}
//	
//	@Test(priority=2,enabled=false)
//	public void verifyLoginPageHeaderTest() {
//		StringQuestion header =page.getInstance(LoginPage.class).getHeader();
//		System.out.println("Title of login page is "+header);
//		AssertJUnit.assertEquals(header, "Don't have an account?");
//	}
//	
//	@Test
//	public void doLoginTest()
//	{
//		HomePage homePage=page.getInstance(LoginPage.class).doLogin("naveenanimation20@gmail.com", "Test@12345");
//		StringQuestion header_home=homePage.getHomePageHeader();
//		System.out.println("header of home page is "+header_home);
//		AssertJUnit.assertEquals(header_home, "Getting started with HubSpot");
//	}
//}
