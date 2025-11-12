package com.fifthSaturday;

public class Q83 {

	//find smallest element form the given array
	public static void main(String args[]) {
		int arr[] = {3,5,4,7,8,2};
		int a = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(a>arr[i]) {
				a = arr[i];
			}
		}
		System.out.println(a);
	}
}
