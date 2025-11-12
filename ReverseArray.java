package com.fifthSaturday;

public class ReverseArray {

	public static void  main(String args[]) {
		
		int nums[] = {1,2,3,4,5,6,7};
		for(int i=0;i<nums.length/2;i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length-i-1];
			nums[nums.length-i-1] = temp;
		}
		
		for(int i:nums) {
			System.out.print(i+" ");
		}
	}
}
