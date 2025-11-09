package com.secondSaturday;

import java.util.Scanner;

public class CalculatePowerOfNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A  and   B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum1=a*a;

		if(b>1) {
		for(int i=1;i<b-1;i++) {
			sum1 *= a;
		}
		}else {
			sum1 = a*b;
		}
		System.out.println(a+" of Power :"+b+" is : "+sum1);
		sc.close();
	}
}
