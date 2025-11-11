package com.fourthSaturday;

import java.util.Scanner;

public class Q69 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num:");
		int num = sc.nextInt();
		int d = num;
		int dig = 0;
		//Digit Find;
		while(d!=0) {
			int l = d%10;
			dig++; 
			d = d/10;
		}
		d = num;
		int sum = 0;
		
		//Counting sum of each digit power
		while(d!=0) {
			int l = d%10;
			int s = l*l;
			for(int i=1;i<dig-1;i++) {
			s *=l;
			}

			sum = sum+s;
			d = d/10;
		}
		
		if(sum == num) {
			System.out.println("Armstrong");;
		}else {
			System.out.println("is Not Armstrong");
		}
		sc.close();
	}
}
