package com.algorithms;

public class ReverseBinaryNumber {
	
	//Cache to store the reverse of all 16 bit numbers. The array will be of size 2^16
	
	static long reverseCache[];

	public static void main(String[] args) {
		
		reverseCache = new long[1<<16];
		
		populateCache();
		
		System.out.println("Cache has been populated!");
		
		long x = 9223372036854775803l;//0111111111111111111111111111111111111111111111111111111111111011 in binary
		//Reverse would be 110111111111111111111111111111111111111111111111111111111111111
		
		/*
		 * Let the 64 bit number be y3y2y1y0 with y3 being the Most Significant Bit.
		 * rev(y3y2y1y0) = rev(y0)rev(y1)rev(y2)rev(y3)
		 */
		int wordSize = 16;
		int bitMask = 0xFFFF;
		System.out.println("Number to be reversed is: "+Long.toBinaryString(x));
		//Calculate reverse and then shift
		long reversedNumber = reverseCache[(int)(x&bitMask)]<<(3*wordSize)|
				reverseCache[(int)((x>>>wordSize)&bitMask)]<<(2*wordSize)|
				reverseCache[(int)((x>>>(wordSize*2)&bitMask))]<<(wordSize)|
				reverseCache[(int)(x>>>(wordSize*3)&bitMask)];
		
		/*System.out.println("Bitmask check: "+Long.toBinaryString(x>>>(wordSize*3)&bitMask));
		System.out.println("checking the cache: "+Long.toBinaryString(reverseCache[(int)(x>>>(wordSize*3)&bitMask)]));
		System.out.println("Checking wordsize * 3: "+Long.toBinaryString(x>>>(wordSize*3)));
		long rev1 = reverseCache[(int)(x>>>(wordSize*3)&bitMask)];*/
		
		System.out.println("Reversed Number is: "+Long.toBinaryString(reversedNumber));
			
	}
	
	static void populateCache() {
		for(int i=0;i<(1<<16);i++) {
			//For each 16 bit number populate the reverse binary number
			reverseCache[i] = reverseBinaryNumber(i);
			//System.out.println(i);
		}
	}
	
	
	static int reverseBinaryNumber(int x) {
		
		//x is a 16 bit binary number. We need to reverse it
		//Start from MSB and LSB and move inwards swapping each bit.
		//Swap 15th bit and 0th bit, 14th bit and 1st bit and so on...
		int msbIndex = 15;
		int lsbIndex = 0;
		while(lsbIndex<msbIndex) {
			//Call the swap method with the number and the indices
			x = swapBits(x,lsbIndex,msbIndex);
			//System.out.println(Integer.toBinaryString(x));
			lsbIndex++;
			msbIndex--;
		}
		
		
		return x;
	}
	
static int swapBits(int x,int i,int j) {
	
	int s = 1;
		
	int ithBit = (x>>>i)&s;
	int jthBit = (x>>>j)&s;
		if(ithBit==jthBit) return x;
		
		else {
			int iBitMask = (1<<i);
			int jBitMask = (1<<j);
			int finalMask = iBitMask|jBitMask;
			//System.out.println("Final Mask:"+ Integer.toBinaryString(finalMask));
			x = x ^ finalMask;
			//System.out.println("X:"+ Integer.toBinaryString(x));
			return x;
		}
	}

}
