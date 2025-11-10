package com.thirdSaturday;

public class FibonaciSeries {

	public static void main(String args[]) {
		
		int a = 0;
		int b = 1;
		
//		System.out.print(a+" "+b+" ");
		for(int i=1;i<=100;i++) {
			System.out.print(a +" ");
			i = a+b;
			a = b;
			b = i;
			
		}
	}
}
