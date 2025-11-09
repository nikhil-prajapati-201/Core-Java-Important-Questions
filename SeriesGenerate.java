package com.secondSaturday;

public class SeriesGenerate {

	public static void main(String args[]) {
//		for(int i=1;i<=20;i++) {
//			if(i%2==0) {
//				System.out.print(i+" ");
//			}
//		}
		
		int arr[]= {15,87,2,65,74};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
			System.out.print(arr[i]+ " ");
		}
	}
}
