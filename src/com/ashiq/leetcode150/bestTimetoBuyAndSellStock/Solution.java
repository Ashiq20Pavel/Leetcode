package com.ashiq.leetcode150.bestTimetoBuyAndSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int min = prices[0], profit = 0;
        for(int i = 0; i < prices.length; i++){
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
