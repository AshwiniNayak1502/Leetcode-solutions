class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] a=new int[2];
        int left=0;
        int right=n-1;
        while(left<right)
        {
            int sum=numbers[left]+numbers[right];
            if(sum==target)
            {
                a[0]=left+1;
                a[1]=right+1;
                return a;
            }
            else if(sum>target)
                 right--;
            else
                left++;   
        }
        return a;
    }
}
