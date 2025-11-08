package com.firstSaturday;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Radius of The Circle: ");
		int r = sc.nextInt();
		
		System.out.println("The Area of Circle is: "+ ((r*r)*3.14));
		sc.close();
	}
}
