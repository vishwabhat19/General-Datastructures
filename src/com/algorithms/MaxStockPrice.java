package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MaxStockPrice {

	public static void main(String[] args) {
		List<Integer> prices = new ArrayList<Integer>();
		prices.add(1);
		prices.add(2);
		prices.add(100);
		System.out.println("Max Profit: "+stockMax(prices));
	}
	
	static long stockMax(List<Integer> prices) {
		

	    // Write your code here
	    long max = 0;
	    for(int i=0;i<prices.size()-1;i++){
	        for(int j=i+1;j<prices.size();j++){
	          
	            if((prices.get(j)-prices.get(i))>max){
	                max = prices.get(j)-prices.get(i);
	            }
	        }
	    }
	    return max;
	    
	}

}
