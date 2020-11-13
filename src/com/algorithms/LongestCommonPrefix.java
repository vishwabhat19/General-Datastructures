package com.algorithms;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String strs[] = {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(strs));

		

	}
	
	
	public static String longestCommonPrefix(String[] strs) {
		
		
		if(null==strs||strs.length==0) return "";
		
		int numberOfStrings = strs.length;
		int lengthOfFirstString = strs[0].length();
		
		StringBuilder builder = new StringBuilder();
		
		for(int i=0;i<lengthOfFirstString;i++) {
			
			char c = strs[0].charAt(i);
			
			for(int j=1;j<numberOfStrings;j++) {
				//Compares the letters of the remaining words from second to end
				if(i>=strs[j].length() || c!=strs[j].charAt(i)) {
					return builder.toString();
				}
			}
			
			builder.append(c);
		}
		
		return builder.toString();
	}

}
