package com.fourthSaturday;

public class PatternSix {

	public static void main(String args[]) {
		
		for(int i=1;i<=5;i++) {
			for(char c ='A';c<='F'-i;c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
	}
}
