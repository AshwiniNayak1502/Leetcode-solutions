class Solution {
    public int maxProfit(int[] prices) {
        int b=0;
        int s=0;
        int p=0;
        while(s<prices.length){
            if(prices[b]>prices[s]){
                b=s;
            }
            if(p<prices[s]-prices[b]){
                p=prices[s]-prices[b];
            }
            s++;
        }
        return  p;
    }
}
