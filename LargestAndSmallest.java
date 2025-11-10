package com.thirdSaturday;

import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int n = sc.nextInt();
		int s = n;
		for(int i=1;i<10;i++) {
			System.out.println("Enter num");
			int m = sc.nextInt();
			if(n<m) {
				n = m;
			}
			
			if(s>m) {
				s = m;
			}
			
		}	
		System.out.println("Maximum Number "+n);
		System.out.println("Smallest Number "+s);
		
		sc.close();
	}
}
