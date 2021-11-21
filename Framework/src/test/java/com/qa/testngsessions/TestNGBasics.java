package com.qa.testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	@BeforeSuite
	public static void beforesuite() {
		System.out.println("BS--Beforesuite");
	}
	@BeforeTest
	public static void beforetest() {
		System.out.println("BT--beforetest");
	}
	@BeforeClass
	public static void beforeclass() {
		System.out.println("BC--beforeclass");
	}
	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("BM--beforemethod");
	}
	@Test
	public static void test1() {
		System.out.println("open browser");
	}
	@Test
	public static void test2() {
		System.out.println("enter url");
	}
	@Test
	public static void test3() {
		System.out.println("please login");
	}
	@Test
	public static void test4() {
		System.out.println("logout");
	}
	@AfterMethod
	public static void afterMethod() {
		System.out.println("AM--after method");
	}

	@AfterTest
	public static void afterTest() {
		System.out.println("AT--aftertest");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("AC--after class");
	}
	@AfterSuite
	public static void aftersuite() {
		System.out.println("AS--after suite");
	}
}
