class Solution {
    public String customSortString(String order, String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder res=new StringBuilder();
        for(char c:order.toCharArray()){
            if(freq[c-'a']>0){
                while(freq[c-'a']>0){
                    res.append(c);
                    freq[c-'a']--;
                }
            }
        }
        for(char c:s.toCharArray()){
            while(freq[c-'a']>0){
                 res.append(c);
                    freq[c-'a']--;
            }
        }
        return new String(res);
    }
}
