package com.firstSaturday;

import java.util.Scanner;


public class FindProfitAndLoss {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Selling Price of Product: ");
		int sprice = sc.nextInt();
		
		System.out.println("Enter The Actual Price of The Prduct: ");
		int aprice = sc.nextInt();
		
		int sum = sprice - aprice;
		if(sum>0) {
			System.out.println("The Profit is: "+sum);
		}else {
			System.out.println("The Loss is: "+sum);
		}
		
		sc.close();
	}
}
