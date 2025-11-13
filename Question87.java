package com.sixthSaturday;

public class Question87 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5}; // smax = 54 && smin=5
		int max = arr[0];
		int min = arr[0];
		
		int smax=0;
		
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];	
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		int smin=max;
		for(int i=0;i<arr.length;i++) {
			
				if(smin>arr[i] && arr[i]!=min) {
					smin = arr[i];
				}
				
				if(smax<arr[i] && arr[i]!=max) {
					smax = arr[i];				
			}
			
		}
		
		System.out.println("Second small: "+smin );
		System.out.println("Second Biggest: "+smax );
		 
		
	}
}
