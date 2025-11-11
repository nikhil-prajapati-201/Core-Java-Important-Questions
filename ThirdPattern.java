package com.fourthSaturday;

public class ThirdPattern {

	public static void main(String[] args) {

		int n = 1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}

}
