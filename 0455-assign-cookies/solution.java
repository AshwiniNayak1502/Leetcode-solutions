class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        int gp=0;
        int sp=0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(gp<g.length && sp<s.length){
            if(g[gp]<=s[sp]){
                count++;
                gp++;
            }
            sp++;
        }
        return count;
    }
}
