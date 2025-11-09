package com.secondSaturday;

public class PrintCharacterFromAtoZ {

	public static void main(String args[]) {
		
		for(char c = 'A'; c<='Z';c++) {
			System.out.print(c+" ");
		}
		System.out.println();
		char ch = 'A';
		while(ch<='Z') {
			System.out.print(ch+" ");
			ch++;
		}
	}
}
