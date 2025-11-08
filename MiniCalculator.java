package com.firstSaturday;

import java.util.Scanner;

public class MiniCalculator {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value of A: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Value of B: ");
		int b = sc.nextInt();
		
		System.out.println("The Addition: "+(a+b));
		System.out.println("The Subtraction: "+(a-b));
		System.out.println("The Multiplication: "+(a*b));
		System.out.println("The Division: "+(a/b));
		
		sc.close();
	}
}
