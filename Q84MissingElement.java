package com.fifthSaturday;

public class Q84MissingElement {

	public static void main(String[] args) {
		
		int arr[] = {5,6,7,8,9,11};

		int j = arr[0];
		
		for(int i=0;i<arr.length;i++) {
		   if(arr[i] == j) {
			   j++;
		}else {
			System.out.println(j);
			j++;
			j++;
		}
	}
}

}
