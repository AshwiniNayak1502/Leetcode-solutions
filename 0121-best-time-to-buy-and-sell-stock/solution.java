class Solution {
    public int maxProfit(int[] prices) {
        int buy=0,sell=0,profit=0;
        for( sell=0;sell<prices.length;sell++){
            if(prices[buy]>prices[sell]){
                buy=sell;
            }
            profit=Math.max(profit,prices[sell]-prices[buy]);
            // sell++;
        }
        return profit;
    }
}
