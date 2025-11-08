package com.firstSaturday;

import java.util.Scanner;

public class SubjectsResult {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sumOfmarks = 0;
		for(int i=1;i<=5;i++) {
			System.out.println("Enter The Subject "+i+" Marks: ");
			int marks = sc.nextInt();
			sumOfmarks =  sumOfmarks + marks;
		}
		double percentage = (sumOfmarks*100)/500;
		System.out.println("The Total Marks: "+sumOfmarks);
		System.out.println("The Average Marks: "+(sumOfmarks/5));
		System.out.println("The Percentage is: "+percentage+"%");
		
		sc.close();
	}

}
