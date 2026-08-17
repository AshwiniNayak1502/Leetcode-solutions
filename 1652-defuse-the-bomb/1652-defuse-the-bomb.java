class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] ans=new int[n];
        if(k==0){
            return ans;
        }

        if(k>0){
            int sum=0;
            for(int i=1;i<=k;i++){
                sum+=code[i];
            }
            for(int i=0;i<n;i++){
                ans[i]=sum;
                sum-=code[(i+1)%n];
                sum+=code[(i+k+1)%n];
            }
        }

        if(k<0){
            int sum=0;
            k=Math.abs(k);
            int j;
            for(j=n-1;j>=n-k;j--){
                sum+=code[j];
            }
            j++;
            for(int i=0;i<n;i++){
                ans[i]=sum;
                sum-=code[j];
                sum+=code[(j+k)%n];
                j=(j+1)%n;
            }
        }

        return ans;
    }
}