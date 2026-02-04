class Solution {
    public int maxProfit(int[] prices) {
       int minPrice = prices[0];
       int maxProfit = Integer.MIN_VALUE;
       for(int i = 0 ;i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
       }
       return maxProfit;
    }
}
