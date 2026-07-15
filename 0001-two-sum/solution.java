class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> st=new HashMap<>();
	    for(int i=0;i<nums.length;i++){
	        if(!st.containsKey(target-nums[i])){
	            st.put(nums[i],i);
	        }
	        else{
	            ans[0]=i;
                ans[1]=st.get(target-nums[i]);
	        }
	    }
        return ans;
    }
}
