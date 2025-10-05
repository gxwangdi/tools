package com.company;

public class Task2 {

	public static void main(String[] args) {
		int[] test = {1,2,3,4,5,6,7};
		System.out.println(solve(test, 4, 8));
	}
	
	public static int solve(int[] array, int k, int p) {
		if (array == null || array.length < k+p) {
			return -1;
		}
		int[] sum = new int[array.length+1];
		for (int i=1; i<sum.length; i++) {
			sum[i] = sum[i-1]+array[i-1];
		}
		// subsum[i, j] == sum[j]-sum[i]
		
		return 0;
	}
	
	private static int[] posLeft(int[] array, int k ) {
	    //  
	}

	private static int getMax(int[] prefixSum, int k, int p) {
		//  
	}
}



