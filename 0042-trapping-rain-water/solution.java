class Solution {
    public int trap(int[] height) {
        int[] lm=new int[height.length];
        int[] rm=new int[height.length];
        lm[0]=height[0];
        rm[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            lm[i]=Math.max(lm[i-1],height[i]);
        }
        for(int i=height.length-2;i>=0;i--){
            rm[i]=Math.max(rm[i+1],height[i]);
        }
        int water=0;
        for(int i=0;i<height.length;i++){
            water+=Math.min(lm[i],rm[i])-height[i];
        }
        return water;
    }
}
