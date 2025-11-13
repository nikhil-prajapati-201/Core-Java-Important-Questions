package com.sixthSaturday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question89 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of arr: ");
		int nn = sc.nextInt();
		int nums[] = new int[nn];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Enter Elements: ");
			int n = sc.nextInt();
			nums[i] = n;
		}
		
		List<Integer> l = new ArrayList<Integer>();
		
	
		int count = 1;
		for (int i = 0; i < nums.length; i++) {
			count = 1;
			for (int j = 0; j < nums.length; j++) {
				if(i!=j && nums[j] == nums[i]) {
					count++;
				}
			}
			if(count == 1) {
				l.add(nums[i]);
			}
		}
		
		System.out.println("Unique Elements: "+l);
		sc.close();
	}
}
