class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] a=new int[2*n];
        for(int i=0;i<n;i++)
        {
            a[i]=nums[i];
        }
        int k=0;
        for(int j=n;j<(2*n);j++)
        {
            a[j]=nums[k];
            k++;
        }
        return a;
    }
}
