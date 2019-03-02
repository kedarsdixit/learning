package com.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class CombinationsOfStrings {
	
	
	public static List<String> findAllCombinations(String input){

		List<String> allStrings = new ArrayList<>();
		
		 for (int i = 0; i < input.length(); i++)  
	           for (int j = i+1; j <= input.length(); j++) 
	              
//	    System.out.println("i - "+i+ " j - "+j);    	   
	                System.out.println(input.substring(i, j)); 
		
		
		return null;
		
		
		
	}
	
	public static void main(String[] args) {
		findAllCombinations("Kedar");
	}

}
