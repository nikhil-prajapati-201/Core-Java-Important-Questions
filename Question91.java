package com.sixthSaturday;

import java.util.Scanner;

public class Question91 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of Arr: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter Element: ");
			int j = sc.nextInt();
			arr[i] = j;
			
		}
		int target = 5;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == target) {
				System.out.println("Target: "+target+" at index: "+i);
				break;
			}
		}
		
		sc.close();
	}
}
