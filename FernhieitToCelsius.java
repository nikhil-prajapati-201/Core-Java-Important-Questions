package com.firstSaturday;

import java.util.Scanner;

public class FernhieitToCelsius {

	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Ferenheit: ");
		double Ferenheit = sc.nextDouble();
		
		double cesius = (Ferenheit - 32)*(9/5);
		System.out.println("Cesius: "+cesius);
		sc.close();
	}
}
