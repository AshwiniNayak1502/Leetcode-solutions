class Solution {
    public int[] rotateElements(int[] nums, int k) {
      List<Integer> l=new ArrayList<>();
      List<Integer> n=new ArrayList<>();
      int[] out=new int[nums.length];
      for(int i=0;i<nums.length;i++)
          if(nums[i]>=0) 
              l.add(i);
      for(int i=0;i<l.size();i++){
          n.add(l.get((i+k)%l.size()));
      }
      int j=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]<0)
              out[i]=nums[i];
          else{
              if(j<n.size())
                   out[i]=nums[n.get(j++)];
          }
             
      }
        return out;
    } 
}
