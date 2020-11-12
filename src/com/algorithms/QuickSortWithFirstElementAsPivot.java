package com.algorithms;

public class QuickSortWithFirstElementAsPivot {
	
	public static void main(String args[]) {
		
		int a[] = {11,2,10,1,4};
		
		quickSort(a,0,a.length-1);
		
		for(int n: a) System.out.println(n);
	}
	
	static void quickSort(int a[],int p,int r) {
		if(p<r) {
			int q = partition(a,p,r);
			quickSort(a, p, q-1);
			quickSort(a, q+1, r);
		}
		
	}
	
	static int partition(int a[],int p,int r) {
		
		int pivotIndex = p;
		int lessIndex = p;
		for(int j=p+1;j<=r;j++) {
			if(a[j]<a[pivotIndex]) {
				int temp = a[j];
				lessIndex++;
				a[j] = a[lessIndex];
				a[lessIndex] = temp;
			}
		}
		
		int temp = a[pivotIndex];
		a[pivotIndex] = a[lessIndex];
		a[lessIndex] = temp;
		return(lessIndex);
		
	}

}
