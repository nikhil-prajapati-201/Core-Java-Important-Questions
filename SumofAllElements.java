package com.fifthSaturday;

public class SumofAllElements {

	public static void main(String args[]) {
		int arr[] = {4,7,5,9,25,86};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum: "+sum);
	}
}
