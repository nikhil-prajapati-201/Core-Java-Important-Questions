package com.firstSaturday;

import java.util.Scanner;

public class FindCubeRot {

public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num");
		int num = sc.nextInt();
		
//		double n = Math.sqrt(num);
//		System.out.println("Square Root: "+num);
		for(int i=1;i<=num;i++) {
			if((num== i*i*i)) {
				System.out.println("Cube Root: "+i);
				break;
			}
			
		}
		sc.close();
}
}
