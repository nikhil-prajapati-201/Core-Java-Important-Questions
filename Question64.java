package com.fourthSaturday;
import java.util.Scanner;
public class Question64 {

	public static void main(String args[]) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		while(n!=0){
			fact = fact*n;
			n--;
		}
		System.out.println(fact);
		sc.close();
	}
}
