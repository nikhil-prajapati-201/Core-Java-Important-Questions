package com.thirdSaturday;

public class SumOfFactorialSeries {

	public static void main(String args[]) {
		int fact = 1;
		int sum = 0;
		for(int i = 1;i<=15;i++) {
			fact *= i;
			System.out.print(fact+" ");
			sum += fact;
		}
		System.out.println("\nSum of 1 to 10 Factorial Series Sum:--> "+sum);
	}
}
