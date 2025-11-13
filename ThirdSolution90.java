package com.sixthSaturday;

public class ThirdSolution90 {

	public static void main(String[] args) {
		
		int arr[] = {5,4,78,90,152,36};
		
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println("Minimum: "+arr[0]);
		System.out.println("Maximum: "+arr[arr.length-1]);
		
	}
}
