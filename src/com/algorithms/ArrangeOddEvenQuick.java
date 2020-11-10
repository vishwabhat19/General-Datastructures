package com.algorithms;

public class ArrangeOddEvenQuick {
	
	//This also arranges the array in O(n) time complexity but does not take any additional space.

	public static void main(String[] args) {
		int a[] = {2,3,5,7,11,13,17,10};
		
		arrangeOddEvenQuick(a);

	}
	
	static void arrangeOddEvenQuick(int a[]) {
		
		int even = 0;
		int odd = a.length-1;
		while(even<odd) {
			if(a[even]%2==0 ) {
				//This means that the index is properly sorted. So move on the next index
				even++;
			}
			else {
				int temp = a[even];
				a[even] = a[odd];
				a[odd] = temp;
				odd--;
			}
		}
		
		for(int n:a)System.out.println(n);
	}

}
