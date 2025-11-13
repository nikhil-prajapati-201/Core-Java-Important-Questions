package com.sixthSaturday;


public class Question90 {

	public static void main(String args[]) {
		
		int arr[] = {5,4,78,90,152,36}; // max = 87 && min = 4 
		int max = arr[0];
		int min = arr[0];
		
		
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
				System.out.println("Minimum : "+min + " \nMaximum: " + max);
	}
}
