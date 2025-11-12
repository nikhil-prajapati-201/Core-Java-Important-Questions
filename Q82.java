package com.fifthSaturday;

public class Q82 {

	public static void main(String args[]) {
		int a[] = {30,35,45,70,8,2};
		
		//is divisible by 5, and 7;
		for(int i=0;i<a.length;i++) {
			if(a[i]%5==0 && a[i]%7==0) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
