package com.algorithms;

public class ArrangeOddEven {
	
	//O(n)

	public static void main(String[] args) {
		
		int a[] = {2,3,5,7,11,13,17,10};
		
		int b[] = new int[a.length];
		
		int index = 0;
		int oddIndex = a.length-1;
		
		for(int i =0;i<a.length;i++) {
			if(a[i]%2==0) {
				b[index] = a[i];
				index++;
			}
			else {
				b[oddIndex] = a[i];
				oddIndex--;
			}
			
		}
		
		for(int n :  b) {
			System.out.println(n);
		}
	}

}
