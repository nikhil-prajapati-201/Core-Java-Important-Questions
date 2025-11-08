package com.firstSaturday;

import java.util.Scanner;

public class SwapTwoNumWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A: ");
		int a = sc.nextInt();
		
		System.out.println("Enter B: ");
		int b = sc.nextInt();
		
		b = a+b;
		a = b-a;
		b = b-a;
		
		System.out.println("A: "+a);
		System.out.println("B: "+b);

		sc.close();
	}

}
