class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int max=candies[0];
        for(int i:candies){
            if(i>max)
                max=i;
        }
        for(int i:candies){
            if(max<=i+extraCandies){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
}
