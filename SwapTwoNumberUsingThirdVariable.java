package com.firstSaturday;

import java.util.Scanner;

public class SwapTwoNumberUsingThirdVariable {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value A: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Value B: ");
		int b = sc.nextInt();
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swap");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		
		sc.close();
	}
}
