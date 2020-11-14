package com.algorithms;

public class FindMedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums1[] = {3,4};
		int []nums2 = {};
				
		System.out.println(findMedianSortedArrays(nums1,nums2));

	}
	
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		double median = 0.0;
		
		/*
		 * if size of both arrays adds up to be even then we have median = sum of middle two elements by two
		 * else median = middle element
		 */
		int l1 = nums1.length;
		int l2 = nums2.length;
		boolean oddCase = (l1+l2)%2==0?false:true;
		int medianIndex =  (l1+l2)/2;//Works fine for arrays with odd size l1+l2
		
		if(l1==0 && l2==0) {
			return 0.0;
		}
		
		else if(l1!=0 && l2!=0) {
			

			int i=0,j=0,totalIndex=0;
			int lastAddedValue = 0;
			for(;totalIndex<medianIndex;) {
				if((i<=nums1.length-1) && (nums1[i]<nums2[j])) {
					
					lastAddedValue = nums1[i];
					i++;
				}
				else if(j<=nums2.length-1){
					lastAddedValue = nums2[j];
					j++;
				}
				
				totalIndex++;
			}
			
			
			
			if(oddCase) {
				
				
				if(i>nums1.length-1) {
					//nums1 is empty
					median = nums2[j];
				}
				else if(j>nums2.length-1) {
					median = nums1[i];
				}
				else {
					
					if(nums1[i]<nums2[j]) {
						median = nums1[i];
					}
					else {
						median = nums2[j];
					}
					
				}
				
				
				
			}
			
			else {
				//even case
				int adder = 0;
				if(i>nums1.length-1) {
					//nums1 is empty
					adder = nums2[j];
				}
				else if(j>nums2.length-1) {
					adder = nums1[i];
				}
				else {
					//both are not empty
					if(nums1[i]<nums2[j]) {
						adder = nums1[i];
					}
					else {
						adder = nums2[j];
					}
					
				}
				
				median = (adder+lastAddedValue)/2.0;
			}
			
			
			
		}
		
			
		return median;
		
		
        
    }

}
