package com.thirdSaturday;

public class Gseries3 {

	public static void main(String args[]) {
		for(int i = 1;i<=5;i++) {
			System.out.print(i+" ");
			if(i == 5) {
				for(int j = 4;j>=1;j--) {
					System.out.print(j+" ");
				}
			}
		}
	}
}
