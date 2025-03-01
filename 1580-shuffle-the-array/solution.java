class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int[2*n];
        int j=0;
        int i;
        for(i=0;i<(2*n);i=i+2)
        {
            a[i]=nums[j];
            j++;
        }    
        for(i=1;i<(2*n);i=i+2)
        {
            a[i]=nums[j];
            j++;
        }
        return a;
    }
}
