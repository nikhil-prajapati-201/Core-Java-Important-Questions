package com.sixthSaturday;


import java.util.Scanner;

public class SecondSolution89 {

	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of arr: ");
		int nn = sc.nextInt();
		int nums[] = new int[nn];
		
		int count =1;
		int c = 0;
		
		for(int i=0;i<nn;i++) {
			System.out.println("Enter element");
			int n = sc.nextInt();
			nums[i] = n;
		
		}
		
		for(int i=0;i<nn;i++) {
			count = 1;
			for (int j = 0; j < nums.length; j++) {
				if(nums[i] == nums[j] && i!=j) {
					count++;
				}
			}
			if(count==1) {
				c++;
			}
		}
		
		int ua[] = new int[c];
		c = 0;
		for(int i=0;i<nn;i++) {
			count = 1;
			for (int j = 0; j < nums.length; j++) {
				if(nums[i] == nums[j] && i!=j) {
					count++;
				}
			}
			if(count==1) {
				ua[c] = nums[i];
				c++;
			}
		}
		
		System.out.print("Unique Arays Elements:");
		for(int i:ua) {
			System.out.print(i+" ");
		}
		
		sc.close();
		
	}
}
