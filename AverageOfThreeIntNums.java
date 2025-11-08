package com.firstSaturday;

import java.util.Scanner;

public class AverageOfThreeIntNums {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Value: ");
		int one = sc.nextInt();
		
		System.out.println("Enter Second Value: ");
		int second = sc.nextInt();
		
		System.out.println("Enter Third Value: ");
		int third = sc.nextInt();
		
		System.out.println("The Average of all number is: "+ (one+second+third)/3);
		
		sc.close();
	}
}
