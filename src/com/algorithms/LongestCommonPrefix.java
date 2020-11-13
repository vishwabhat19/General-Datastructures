package com.algorithms;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String strs[] = {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(strs));

		

	}
	
	
	public static String longestCommonPrefix(String[] strs) {
        
		
		if(null==strs||strs.length==0) return "";
		StringBuilder builder = new StringBuilder();
		int lengthFirstString = strs[0].length();
		int totalLength = strs.length;
		for(int i=0;i<lengthFirstString;i++) {
			char c = strs[0].charAt(i);
			for(int j=1;j<totalLength;j++) {
				if(i>=strs[j].length()||c!=strs[j].charAt(i)) {
					return builder.toString();
				}
				
			}
			builder.append(c);
		}
		return builder.toString();
    }

}
