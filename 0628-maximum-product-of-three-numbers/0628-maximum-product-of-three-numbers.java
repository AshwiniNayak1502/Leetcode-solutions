class Solution {
    public int maximumProduct(int[] nums) {
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        int t=Integer.MIN_VALUE;

        int fl=Integer.MAX_VALUE;
        int sl=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>f){
                t=s;
                s=f;
                f=nums[i];
            }
            else if(nums[i]>s){
                t=s;
                s=nums[i];
            }
            else if(nums[i]>t){
                t=nums[i];
            }


            if(nums[i]<fl){
                sl=fl;
                fl=nums[i];
            }
            else if(nums[i]<sl){
                sl=nums[i];
            }
        }

        

        return Math.max(f*s*t , f*fl*sl);
    }
}