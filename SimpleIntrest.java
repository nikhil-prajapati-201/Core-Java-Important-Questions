package com.firstSaturday;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String args[]) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Initial Amount:");
		int p = sc.nextInt();
		
		System.out.println("Enter The Rate of Interest:");
		int r = sc.nextInt();
		
		System.out.println("Enter Time Duration of interest in month");
		int t = sc.nextInt();
		
		double intrest = (p*r*t)/100;
		System.out.println("Simple Interest: "+intrest);
		
		sc.close();
	}
	
}
