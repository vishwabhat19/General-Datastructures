package com.algorithms;

public class KnapSack 
{ 
	
	public static void main(String args[]) {
		int W = 6;
		int wt[] = {1,2,4};
		int val[] = {10,12,28};
		int n = 3;
		System.out.println(knapSack(W, wt, val, n));
	}
    // Returns the maximum value that can be put in a knapsack of capacity W 
	static int knapSack(int W, int wt[], int val[], int n) {
		int T[][] = new int[n + 1][W + 1];

		for (int i = 0; i < W + 1; i++) {
			T[0][i] = 0;
		}

		for (int i = 1; i < (n + 1); i++) {
			T[i][0] = 0;
			for (int j = 1; j < (W + 1); j++) {
				if (wt[i - 1] <= j && ((val[i - 1] + T[i - 1][j - wt[i - 1]]) > (T[i - 1][j]))) {
					T[i][j] = val[i - 1] + T[i - 1][j - wt[i - 1]];
				} else {
					T[i][j] = T[i - 1][j];
				}
			}
		}

		return T[n][W];

	}
    
}
