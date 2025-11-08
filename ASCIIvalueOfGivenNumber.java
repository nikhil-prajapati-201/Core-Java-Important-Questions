package com.firstSaturday;

import java.util.Scanner;

public class ASCIIvalueOfGivenNumber {

	//'A' = 65;
	//'a' = 97;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The character: ");
		
		char ch = sc.next().charAt(0);
		System.out.println(ch +" - of ASCII :"+ (ch+'0'-'0'));
		
		sc.close();
	}

}
