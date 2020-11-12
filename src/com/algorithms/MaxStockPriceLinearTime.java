package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MaxStockPriceLinearTime {

	public static void main(String[] args) {
		List<Integer> prices = new ArrayList<Integer>();
		prices.add(1);
		prices.add(2);
		prices.add(100);
		System.out.println("Max Profit: "+stockMax(prices));

	}

	static long stockMax(List<Integer> prices) {
		

	    /*
	     * The logic here is that when you start from the greater date and you encounter any share price
	     * which is less you could have made a profit by buying on the lesser date and selling high.
	     * So you move in reverse and keep adding the profit.
	     */
	    int maxPrice = 0;
	    long maxProfit = 0;
	    for(int i=prices.size()-1;i>-1;i--){
	    	if(prices.get(i)>maxPrice) {
	    		maxPrice = prices.get(i);
	    	}
	    	maxProfit = maxProfit + (maxPrice-prices.get(i));
	    }
	    return maxProfit;
	    
	}
}
