package com.secondSaturday;

import java.util.Scanner;

public class SumOfEvenDigits {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		int sumOfEven = 0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				sumOfEven += i; 
			}
		}
		System.out.println("Sum Of All Even Number: "+sumOfEven);
		sc.close();
	}
}
