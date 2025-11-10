package com.thirdSaturday;

import java.util.Scanner;

public class FindNum {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int p = 0;
		int ng=0;
		int z =0;
		for(int i=0;i<10;i++) {
			System.out.println("Enter num");
			int n = sc.nextInt();
			if(n>0) {
				p++;
			}else if(n<0) {
				ng++;
			}else {
				z++;
				
			}
		}
		System.out.println("Positive:"+p);
		System.out.println("Nagetive: "+ng);
		System.out.println("Zero: "+z);
		sc.close();
	}
}
