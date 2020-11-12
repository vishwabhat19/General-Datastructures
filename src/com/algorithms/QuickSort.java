package com.algorithms;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {11,2,10,1,4};
		
		quickSort(a,0,a.length-1);
		
		for(int n:a) System.out.println(n);

	}
	
	static void quickSort(int a[],int p,int r) {
		
		if(p<r) {
			int q = partition(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);
		}
		
	}
	
	static int partition(int a[],int p,int r) {
		
		/*
		 * How do you write the partition algorithm
		 */
		//Take some element as pivot - lets take the last element as pivot
		int pivotIndex = r;
		int lessThanPivotArrayIndex = p-1;
		for(int j=p;j<pivotIndex;j++) {
			if(a[j]<a[pivotIndex]) {
				//This means that this element is less than Pivot element so increase the lessThanPivotArrayIndex
				//Swap it with the next element which we don't know is greater or lesser than pivot element
				int temp = a[j];
				lessThanPivotArrayIndex++; 
				a[j] = a[lessThanPivotArrayIndex];
				a[lessThanPivotArrayIndex] = temp;
			}
			
		}
		//swap with pivot index
		int temp = a[lessThanPivotArrayIndex+1];
		a[lessThanPivotArrayIndex+1] = a[pivotIndex];
		a[pivotIndex] = temp;
		return (lessThanPivotArrayIndex+1);
		
	}

}
