package com.algorithms;

public class SwapBits {
	
	public static void main(String args[]) {
		
		int i = 1,j=3,n=8;
		
		int x = swapBits(n, i, j);
		System.out.println("The entered number is: "+Integer.toBinaryString(n)+" and the swapped number is: "
		+Integer.toBinaryString(x));
	}
	
	static int swapBits(int x,int i,int j) {
		
		int ithBit = (x>>>i)&1;
		int jthBit = (x>>>j)&1;
		if(ithBit==jthBit) return x;
		
		else {
			int iBitMask = (1<<i);
			int jBitMask = (1<<j);
			int finalMask = iBitMask|jBitMask;
			x = x ^ finalMask;
			return x;
		}
	}

}
