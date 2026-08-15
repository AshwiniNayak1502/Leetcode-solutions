class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=-1;
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                ans[st.pop()]=nums[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int curr=st.peek();
            int id=(curr+1)%n;
            while(id!=curr){
                if(nums[id]>nums[st.peek()]){
                    ans[curr]=nums[id];
                    break;
                }
                id=(id+1)%n;
            }
            st.pop();
        }
        return ans;
    }
}