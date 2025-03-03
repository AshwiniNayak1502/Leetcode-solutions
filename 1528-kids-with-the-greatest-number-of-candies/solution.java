class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean> out=new ArrayList<>();
        boolean a=true;
        for(int i=0;i<n;i++)
        {
            int c=candies[i]+extraCandies;
            for(int j=0;j<n;j++)
            {
                if(j==i)
                    continue;
                else
                {
                    if(c>=candies[j])
                      a=true;
                    else
                    {
                      a=false;
                      break;
                    }
                }
            }
            out.add(a);
        }
        return out;
    }
}
