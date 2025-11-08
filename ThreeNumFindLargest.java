package com.firstSaturday;

import java.util.Scanner;

public class ThreeNumFindLargest {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number A: ");
		int a = sc.nextInt();
		
		System.out.println("Number B: ");
		int b = sc.nextInt();
		
		System.out.println("Number C: ");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is Largest");
		}else if(b>a && b>c) {
			System.out.println("B is Largest");
		}else {
			System.out.println("C is Largest");
		}
		
		sc.close();
	}
}
