package com.fourthSaturday;

import java.util.Scanner;
public class Q66 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num:");
		int num = sc.nextInt();
		int Count = 0;
		while(num!=0) {
			int l = num%10;
			Count++;
			num = num/10;
		}
		System.out.println(Count+ " Digits");
		sc.close();
	}
}
