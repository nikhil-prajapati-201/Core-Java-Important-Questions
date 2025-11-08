package com.firstSaturday;

import java.util.Scanner;

public class HoursConversion {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hour: ");
		int h = sc.nextInt();
		System.out.println("Minutes: "+(h*60));
		System.out.println("Seconds: "+ (h*3600));
		
		sc.close();
	}
}
