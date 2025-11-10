package com.thirdSaturday;

public class GerateSeries5 {

	public static void main(String args[]) {
		
		int diff = 0;
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
			diff = diff + 2;
			i = i + diff;
		}
	}
}
