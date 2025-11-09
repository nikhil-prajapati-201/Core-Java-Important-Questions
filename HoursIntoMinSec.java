package com.secondSaturday;

import java.util.Scanner;

public class HoursIntoMinSec {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hours:");
		int hours = sc.nextInt();
		
		int min = hours*60;
		int sec = min*60;
		System.out.println("Minuites : "+min);
		System.out.println("Seconds : "+sec);
		sc.close();
	}
}
