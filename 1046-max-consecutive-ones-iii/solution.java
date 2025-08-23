class Solution {
    public int longestOnes(int[] nums, int k) {
        int right=0,left=0,max=0,flip=0;
        while(right<nums.length){
            if(nums[right]==0){
                flip++;
            }
            while(flip>k){
                if(nums[left]==0){
                    flip--;
                }
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}
