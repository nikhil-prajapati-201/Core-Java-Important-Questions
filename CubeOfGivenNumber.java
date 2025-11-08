package com.firstSaturday;

import java.util.Scanner;

public class CubeOfGivenNumber {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		System.out.print("The Number: "+num);
		System.out.println(" And The Cube is: "+(num*num*num));
		
		sc.close();
	}
}
