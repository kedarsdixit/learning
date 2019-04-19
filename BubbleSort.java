package com.kd.codes;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] data = new int[] {8,2,5,3,5,8,9,10,0};
		
		for(int i :bubbleSort(data)) {

			System.out.println(i);	
		}
	}
	
	/**
	 * 
	 * Bubble sort method
	 * @param input
	 * @return sorted int array
	 */
	public static int[] bubbleSort(int[] input) {
		
		
		for(int i = 0; i<input.length; i++ ) {
			
			for(int j=i;j<input.length; j++) {
				
				if(input[i]>input[j]) {
					
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					
				}				
				
				
				
				
			}
		}
		
		return input;
	}

}
