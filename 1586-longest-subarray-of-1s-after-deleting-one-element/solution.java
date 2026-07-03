class Solution {
    public int longestSubarray(int[] nums) {
      int left=0;
		int z=1;
		int count=0;
		int right=0;
		while(right<nums.length){
		    if(nums[right]==0){
		        z--;
		    }
		    while(z<0){
		        
		        if(nums[left]==0){
		            z++;
		        }
		        left++;
		    }
		    count=Math.max(count,right-left);
		    right++;
		}
        return count;
    }
}
