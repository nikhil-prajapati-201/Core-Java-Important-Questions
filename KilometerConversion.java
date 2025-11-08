package com.firstSaturday;

import java.util.Scanner;

public class KilometerConversion {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter kiloMeters");
		int km = sc.nextInt();
		
		int m = km*1000;
		System.out.println("in Meters: "+m);
		int cm = m*100;
		System.out.println("in CentiMeters: "+cm);
		int mm = cm*10;
		System.out.println("Mili Meter: "+mm);
		
		sc.close();
	}
}
