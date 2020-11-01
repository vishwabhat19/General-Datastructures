
public class CheckParity {

	public static void main(String[] args) {
		long x = 10;
		
		System.out.println("The number is binary is: "+Long.toBinaryString(x)+" and the parity is: "+parity(x));
	}
	
	static long parity(long x) {
		
		x = x ^ x>>>32;
		x = x ^ x>>>16;
		x = x ^ x>>>8;
		x = x ^ x>>>4;
		x = x ^ x>>>2;
		x = x ^ x>>>1;
		//We now have the parity of the number at the LSB. We extract using a bitmask operation with 1
		x = x & 1;
		return x;
		
	}

}
