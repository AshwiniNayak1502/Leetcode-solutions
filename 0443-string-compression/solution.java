class Solution {
    public int compress(char[] chars) {
        int i=0;
        int w=0;
        while(i<chars.length){
            char current=chars[i];
            int count=0;
            while(i<chars.length&&chars[i]==current){
                count++;
                i++;
            }
            chars[w++]=current;
            String s=String.valueOf(count);
            if(count>1){
                for(char c:s.toCharArray()){
                    chars[w++]=c;
                }
            }
        }
        return w;
    }
}
