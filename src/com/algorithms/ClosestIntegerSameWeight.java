package com.algorithms;
import java.util.Scanner;

/*
 * This program tries to find an integer with the same weight
 * as the input integer.
 * For example if the given number is 1011 then the number with the closest weight is 1101
 * Time complexity is O(n)
 */
public class ClosestIntegerSameWeight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.println("Enter the input: ");
			long x = scanner.nextInt();
			System.out.println("The input is: "+ Long.toBinaryString(x));
			findClosestIntegerSameWeight(x);
		}
		finally {
			scanner.close();
		}
		
	}
	
	static void findClosestIntegerSameWeight(long x) {
		
		int binaryNumberSize = 63;
		
		for(int i=0;i<binaryNumberSize;i++) {
			/* Here we start from the LSB i.e. index =0 and check it with the next bit i.e. index=1
			 * So on we continue to index =1 and index =2 checks in the next iteration
			 * If we find a pair of consecutive bits that are different we swap them
			 */
			long ithBit = (x>>>i)&1;
			long iPlusOnethBit = (x>>>(i+1))&1;
			if(ithBit!=iPlusOnethBit) {
				/*If they are not the same then you swap those bits*/
				//First form the number with set bits in ith and (i+1)th bits to XOR the input with
				long bitMask = (1<<i)|(1<<(i+1));
				//Now xor it
				x = x ^ bitMask;
				break;
			}
		}
		
		System.out.println("The nearest number with same weight is: "+ Long.toBinaryString(x));
	}

}
