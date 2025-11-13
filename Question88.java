package com.sixthSaturday;



public class Question88 {
	
	public static void main(String args[]) {
		int nums[]= {1,2,2,3,5,4,1};
		int count = 1;
		for (int i = 0; i < nums.length; i++) {
			count = 1;
			for (int j = 0; j < nums.length; j++) {
				if(i!=j && nums[j] == nums[i]) {
					count++;
				}
			}
			System.out.println(nums[i]+" : count is : " +count+" ");
		}
		
	}

}
