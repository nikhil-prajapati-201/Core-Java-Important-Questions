package com.firstSaturday;

import java.util.Scanner;

public class FindSmallestNumber {

	public static void main(String args[]) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Number A: ");
			int a = sc.nextInt();
			
			System.out.println("Number B: ");
			int b = sc.nextInt();
			
			if(a<b) {
				System.out.println("A is Smallest Number ");
				
			}
			else {
				System.out.println("B is Smallest Number ");
			}
			sc.close();
	}
	
}
