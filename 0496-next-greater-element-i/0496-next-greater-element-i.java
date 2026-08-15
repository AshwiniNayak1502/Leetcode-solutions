class Solution {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> grate=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
 
        for(int i=0;i<nums2.length;i++){
            
            while(!grate.isEmpty() && nums2[i]>grate.peek()){
                map.put(grate.pop(),nums2[i]);
            }
                grate.push(nums2[i]);
        }
            
                
            
        while(!grate.isEmpty()){
            map.put(grate.pop(),-1);
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}