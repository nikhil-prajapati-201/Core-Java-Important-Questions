package com.fourthSaturday;

import java.util.Scanner;

public class Q68 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num:");
		int num = sc.nextInt();
		int rev = num;
		int sum = 0;
		while(rev!=0) {
			int l = rev%10;
			sum = sum*10 + l;
			rev = rev/10;
		}

		if(num == sum) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("Is Not Palindrome");
		}
		sc.close();
		
	}
}
