package com.sixthSaturday;

public class Question86 {

	//find unique elements in array
	public static void main(String args[]) {
		int arr[]= {1,2,3,1,4,2,5,4,3};
		int count = 1;
		for(int i=0;i<arr.length;i++) {
			count = 1;
			for (int j = 0; j < arr.length; j++) {
				if(i!=j && arr[i] == arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("Unique Element is:  "+arr[i]);
			}
		}
	}
}
