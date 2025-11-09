package com.secondSaturday;

import java.util.Scanner;
public class SquareNumbers {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value of N: ");
		int n = sc.nextInt();
		int num = n;
		for(int i=1;i<=n;i++) {
				System.out.println("Square of "+i+" is: "+(i*i));
		}
		
		int j = 1;
		while(j<=num) {
			System.out.print((j*j)+" ");
			j++;
		}
		
		sc.close();
	}
}
