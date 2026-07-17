class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int num:nums){
            while(num!=0){
                int d=num%10;
                num/=10;
                if(d==digit)
                    count++;
            }
        }
        return count;
    }
}
