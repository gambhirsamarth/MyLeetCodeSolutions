class Solution {
    public int maxProfit(int[] prices) {

        int minValue = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            minValue = Math.min(minValue, prices[i]); // store and update min price
            
            // update profit by current stock price - min price
            profit = Math.max(profit, prices[i] - minValue); 
        }
        return profit; // return profit
    }
}
