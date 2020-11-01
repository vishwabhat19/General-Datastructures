
public class ReverseBinaryNumber {
	
	//Cache to store the reverse of all 16 bit numbers. The array will be of size 2^16
	
	static int reverseCache[];

	public static void main(String[] args) {
		
		reverseCache = new int[1<<16];
		
		populateCache();
		
		System.out.println("Cache has been populated!");
		
			
	}
	
	static void populateCache() {
		for(int i=0;i<(1<<16);i++) {
			//For each 16 bit number populate the reverse binary number
			reverseCache[i] = reverseBinaryNumber(i);
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
		}
		
		return x;
	}
	
	static int swapBits(int x,int i,int j) {
		//Extract the bit at the ith position
		int iBitMask = 1<<i;
		int ithBit = x & iBitMask;
		int jBitMask = 1<<j;
		int jthBit = x & jBitMask;
		if(ithBit == jthBit) return x;
		
		else {
			/*
			 * When both bits are different we just need to toggle them. We don't actually need to
			 * swap them explicitly. So we form a binary number called finalMask which has set bits in
			 * the ith and jth index and XOR it with the actual number x to toggle the bits in those
			 * indices.
			 */
			int finalMask = ithBit | jthBit;
			x = x ^ finalMask;
		}
		
		return x;
	}
	

}
