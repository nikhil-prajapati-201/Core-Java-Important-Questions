package com.firstSaturday;

import java.util.Scanner;

public class TablePrintOfGivenNumber {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int num = s.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+(i*num));
		}
		s.close();
	}
}
