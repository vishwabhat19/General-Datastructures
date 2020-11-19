package com.algorithms;

/*
 * Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
 */
		

public class KadaneAlgorithm {
	
	static int maxSubArraySum(int a[],int n) {
		
		int maxSoFar = a[0];
		int currentMax = a[0];
		
		for(int i=0;i<n;i++) {
			currentMax = Math.max(a[i], currentMax+a[i]);
			maxSoFar = Math.max(maxSoFar, currentMax);
		}
		return maxSoFar;
	}

	 public static void main(String[] args) 
	    { 
	    int a[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
	    int n = a.length;    
	    int max_sum = maxSubArraySum(a, n); 
	    System.out.println("Maximum contiguous sum is " 
	                       + max_sum); 
	    } 

}
