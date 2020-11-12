package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class ParitionArrayOnPivot {

	public static void main(String[] args) {
		
		int a[] = {2,3,5,7,11,13,17,10};
		
		int index = 3;
		
		parition(a,index);
		
		List<Integer> list = new ArrayList<>();
		

	}
	
	static void parition(int a[],int index) {
		
		int pivot = a[index];
		
		int lesserIndex = -1;
		int greaterIndex = a.length+1;
		for(int i=0;i<a.length;i++) {
			if(a[i]<pivot) {
				lesserIndex++;
			}
			else {
				//This means that the number is greater than pivot. 
				//So we can just swap the pivot and that number
				int temp = a[pivot];
				a[pivot] = a[i];
				
			}
		}
		
		
	}

}
