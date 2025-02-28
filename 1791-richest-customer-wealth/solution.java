class Solution {
    public int maximumWealth(int[][] accounts) {
        int row=accounts.length;
        int col=accounts[0].length;
        int[] sum=new int[row];
        int i,j;
        for(i=0;i<row;i++)
            sum[i]=0;
        for( i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                sum[i]=sum[i]+accounts[i][j];
            }
        }
        int l=sum[0];
        for(i=1;i<row;i++)
            if(l<sum[i])
                l=sum[i];
        return l;
    }
}
