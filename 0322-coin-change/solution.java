class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        for(int i=0;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(int c:coins){
            for(int i=c;i<=amount;i++){
                if(dp[i-c]!=Integer.MAX_VALUE)
                    dp[i]=Math.min(dp[i],dp[i-c]+1);
            }
        }
        if(dp[amount]==Integer.MAX_VALUE)
            return -1;
        return dp[amount];
    }
}
