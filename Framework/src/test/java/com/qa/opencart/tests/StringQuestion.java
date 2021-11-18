package com.qa.opencart.tests;

import org.apache.poi.util.SystemOutLogger;

public class StringQuestion {
	public static void main(String[] args) {
		int sum = sumStr("Hi 20 hello 30 to 50 world 80");
		System.out.println("sum is "+ sum);
		
	}
	
	public static int sumStr(String str) {
		String [] split = str.split(" ");
		int sum =0;
		for(String ss : split) {
			try
			{
				Integer i = Integer.parseInt(ss);
				sum = sum + i;
			}
			catch(Exception e) {
				
			}
		}
		return sum;
	}

}
