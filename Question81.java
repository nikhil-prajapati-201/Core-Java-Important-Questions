package com.fifthSaturday;

import java.util.Scanner;

public class Question81 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[8];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter num");
			int n = sc.nextInt();
			arr[i] = n;
		}
		
		for(int i=0;i<arr.length;i++) {
			boolean flag = true;
			int a = arr[i];
			for(int j=2; j<a;j++) {
				if(a%j==0) {
					flag = false;
				}
			}
			if(flag == true) {
				System.out.println("Prime: "+a);
			}
		}
		
		sc.close();
	}
}
