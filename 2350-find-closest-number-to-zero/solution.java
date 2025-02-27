class Solution {
    public int findClosestNumber(int[] nums) {
        int near=nums[0];
        for(int i=1;i<(nums.length);i++)
        {
            if(Math.abs(nums[i])<Math.abs(near))
            {
                near=nums[i];
            }
            if(Math.abs(near)==Math.abs(nums[i]))
            {
                if(near>nums[i])
                    near=near;
                else
                    near=nums[i];
            }
        
        }
        return near;
        
    }
}
