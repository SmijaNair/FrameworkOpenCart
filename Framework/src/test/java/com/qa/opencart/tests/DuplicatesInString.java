//package com.myTests;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class DuplicatesInString {
//	
//	    public static void findIt(StringQuestion str) {  
//	        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
//	        char[] charArray = str.toCharArray();  
//	        for (Character ch : charArray) {  
//	            if (baseMap.containsKey(ch)) {  
//	                baseMap.put(ch, baseMap.get(ch) + 1);  
//	            } else {  
//	                baseMap.put(ch, 1);  
//	            }  
//	        }  
//	        Set<Character> keys = baseMap.keySet();  
//	        for (Character ch : keys) {  
//	             
//	                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
//	            } 
//	        }  
//	      
//	
//	public static void main(StringQuestion[] args) {
//		findIt("smijasreekanth");
//	}
//	
//	
//
//}
