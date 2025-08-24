class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int start=0;
        for(int i:gain){
           start=start+i;
           max=Math.max(max,start);
        }
        return max;
    }
}
