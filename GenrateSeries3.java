package com.thirdSaturday;

public class GenrateSeries3 {

	public static void main(String args[]) {
		int gap = 1;
		System.out.print(0+" "+1+" ");
		for(int i=3;i<=40;i++) {
		
			System.out.print(i+" ");
			
//			   gap = gap+1;
			
				gap =  gap + 1 ;
				i = i+ gap;
			
		}
	}
}
