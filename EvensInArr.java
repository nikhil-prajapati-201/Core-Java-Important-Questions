package com.fifthSaturday;

public class EvensInArr {

	public static void main(String args[]) {
		int arr[] = {4,7,5,9,25,86};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);	
			}
		}
		
	}
}
