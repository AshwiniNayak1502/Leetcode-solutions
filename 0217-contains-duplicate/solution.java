class Solution {
    public boolean containsDuplicate(int[] nums) {
     HashSet<Integer> set=new HashSet<>();
     for(int i:nums){
        if(set.contains(i)){
            return true;
        }
        set.add(i);
     }   
     return false;


    // Arrays.sort(nums);
    // for(int i=nums.length-1;i>0;i--){
    //     if(nums[i]==nums[i-1])
    //         return true;
    // }
    // return false;
    }
}
