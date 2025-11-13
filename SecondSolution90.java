package com.sixthSaturday;

import java.util.TreeSet;

public class SecondSolution90 {

	public static void main(String[] args) {
		
		int arr[] = {5,4,78,90,152,36}; // max = 87 && min = 4 
		int max = arr[0];
		int min = arr[0];
		
		TreeSet<Integer> set = new TreeSet<>();
		for(int j=0;j<arr.length;j++) {
			set.add(arr[j]);
		}


		System.out.println("Minimum : "+set.getFirst() + " \nMaximum: " + set.getLast());

	}
}
