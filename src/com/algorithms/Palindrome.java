package com.algorithms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(is_palindrome(55955));
	}
	
	public static String is_palindrome(Integer n)
    {
		String x = n.toString();
		//String palindrome;
		
		int i = 0,j=x.length()-1;
		while(i<j) {
			if(x.charAt(i)==x.charAt(j)) {
				i++;j--;
				
			}
			else {
				return "Not a palindrome";
			}
		}
		
		return "Is a palindrome";
		
    }

}
