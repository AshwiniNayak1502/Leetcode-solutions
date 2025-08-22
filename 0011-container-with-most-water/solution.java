class Solution {
    public int maxArea(int[] height) {
       int left=0, right=height.length-1;
       int ma=0;
       while(left<right){
        int h=Math.min(height[left],height[right]);
        int d=right-left;
        int a=h*d;
        ma=Math.max(a,ma);
        if(height[left]<height[right])
            left++;
        else
            right--;

       } 
       return ma;
    }
}
