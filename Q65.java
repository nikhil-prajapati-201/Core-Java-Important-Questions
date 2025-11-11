package com.fourthSaturday;

import java.util.Scanner;

public class Q65 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num:");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			int l = num%10;
			sum = sum + l;
			num = num/10;
		}
		System.out.println(sum);
		sc.close();
	}
}
