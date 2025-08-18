class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a= word1.length();
        int b= word2.length();
        int i=0,j=0,k=0;
        char[] c=new char[a+b];
        while(i<a&&j<b){
            c[k++]=word1.charAt(i++);
            c[k++]=word2.charAt(j++);
        }
        while(i<a){
            c[k++]=word1.charAt(i++);
        }
        while(j<b){
            c[k++]=word2.charAt(j++);
        }
        return new String(c);
    }
}
