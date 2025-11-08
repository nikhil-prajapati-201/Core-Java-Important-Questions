package com.firstSaturday;

import java.util.Scanner;

public class TemparatureCount {

	public static void main(String args[]) {
		//Find Temparature celsius to Ferenheit
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Celsius Temparature: ");
		double celsius = sc.nextDouble();
		
		double Ferenheit = ((9/5)+celsius)+32; 
		System.out.println("Ferenheit: "+Ferenheit);
		
		sc.close();
	}
}
