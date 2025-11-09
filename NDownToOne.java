package com.secondSaturday;

import java.util.Scanner;
public class NDownToOne {

	public void reverseMethod(int n) {
		for(int i=n;i>=1;i--) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N:");
		int n = sc.nextInt();
		int num = n;
		System.out.print("For Loop Output: ");
		for(int i=n;i>=1;i--) {
			System.out.print(i+" ");
		}

		int i = n;
		System.out.print("\nWhile Loop Output: ");
		while(i!=0) {
			System.out.print(i+" ");
			--i;
		}
		
		int j = n;
		System.out.print("\nDo While loop Output: ");
		do{
			System.out.print(j+" ");
			--j;
		}while(j!=0); 
		
		NDownToOne method = new NDownToOne();
		System.out.println("\n\nManually Method");
		method.reverseMethod(num);
		
		
		
		
		
		sc.close();
	}
}
