package com.thirdSaturday;

public class Gseries4 {

	public static void main(String args[]) {
		
		for(int i=1; i<=1000;i*=10) {
			System.out.print(i+" ");
		
			if(i == 1000) {
				for(int j =1000;j>1;j/=10 ) {
					System.out.print(j/10+" ");
				}
			}
			
		}
	}
}
