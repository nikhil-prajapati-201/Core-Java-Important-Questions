package com.firstSaturday;

import java.util.Scanner;
public class SumOfTwoInteger {

	public static void main(String args[]) {
		
		Scanner sc  =  new Scanner(System.in);
		
		System.out.println("Enter the Value of A: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Value of B: ");
		int b = sc.nextInt();
		
		System.out.println("The Sum of Two Integer is: "+ (a+b));
		
		sc.close();
		
	}
}
