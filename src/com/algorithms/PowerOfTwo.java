package com.algorithms;

public class PowerOfTwo {

	public static void main(String[] args) {
		
			long n = 11;
			System.out.println(isPowerofTwo(n));
	}
	
	
	 public static boolean isPowerofTwo(long n){
	        
		 	if(n==0) return false;
		 	if(n==1) return false;
	       while(n!=1) {
	    	  long rem = n % 2;
	    	  if(rem!=0) return false;
	    	  else {
	    		  n=n/2;
	    	  }
	    	   
	       }
	       return true;
	        
	    }
}
