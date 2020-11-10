package com.algorithms;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {2,3,5,7,11,13,17,10};
		
		quickSort(a,0,a.length);
		
		for(int n:a) System.out.println(n);

	}
	
	static void quickSort(int a[],int p,int r) {
		
		if(p<r) {
			int q = partition(a,p,r);
			quickSort(a,p,q);
			quickSort(a,q+1,r);
		}
		
	}
	
	static int partition(int a[],int p,int r) {
		
		int lesserSortedIndex = p-1;
		int pivotIndex = r-1;
		for(int i=p;i<r;i++) {
			if(a[i]<a[pivotIndex]) {
				//Take this element and put in the sorted array and increment the lesserSortedIndex
				lesserSortedIndex++;
				int temp = a[i]; 
				a[i] = a[lesserSortedIndex];
				a[lesserSortedIndex] = temp;
				
			}
		}
		int temp = a[lesserSortedIndex+1];
		a[lesserSortedIndex+1] = a[pivotIndex];
		a[pivotIndex] = temp;
		return (lesserSortedIndex+1);
	}

}
