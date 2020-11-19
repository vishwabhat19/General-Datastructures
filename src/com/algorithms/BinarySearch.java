package com.algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int k = 44;
		binarySearch(arr,k);
	}
	
	static void binarySearch(int arr[], int k) {
		
		//You need start by dividing by two
		int low = 0,high = arr.length-1;
		int mid;
		String s = "not found";
		
		while(low<=high) {
			mid = (low+high)/2;
			if(k==arr[mid]) {
				s = "Found";break;
			}
			else if(arr[mid]<k) {
				//This means k might be there in the second half
				low = mid+1;
			}
			else {
				//This means that k might be there in first half
				high = mid-1;
			}
		}
		System.out.println(s);
	}

}
