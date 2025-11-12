package com.fifthSaturday;

public class ArrInAscendingOrder {

	public static void main(String args[]) {
		
		int nums[] = {5,3,6,2,1,4,7};
		for(int i=0;i<nums.length;i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		for(int i:nums) {
			System.out.print(i+" ");
		}
	}
}
