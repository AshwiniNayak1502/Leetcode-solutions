class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            for(int j=nums.length-1;j>=i;j--){
            if(nums[j]>nums[i]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                break;
            }
        }
        }
        int left=i+1;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        
        
    }
}
