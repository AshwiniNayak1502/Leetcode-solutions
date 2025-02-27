class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            int b=nums[i];
            a[i]=nums[b];
        }
        return a;
        
    }
}
