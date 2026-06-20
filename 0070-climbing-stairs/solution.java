class Solution {
    static int cl(int n,int[] dp){
        if(n<=2){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=cl(n-1,dp)+cl(n-2,dp);
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        int steps=cl(n,dp);
        return steps;
    }
}
