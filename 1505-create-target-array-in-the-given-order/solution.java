class Solution
 { 
    public int[] createTargetArray(int[] nums, int[] index)
    { 
       int n=nums.length; 
       int[] a=new int[n];
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
            list.add(index[i],nums[i]);
       }
       
       for(int i=0;i<n;i++)
       {
        a[i]=list.get(i);
       }
       return a;
     }
}
