class Solution {
    public String reverseVowels(String s) {
        int a=s.length();
        int i=0,j=a-1;
        char[] b=s.toCharArray();
        while(i<j){
            while(i<j&&!isVowel(b[i])){
                i++;
            }
            while(i<j&&!isVowel(b[j])){
                j--;
            }
            char temp=b[i];
            b[i]=b[j];
            b[j]=temp;
            i++;
            j--;
        }
        return new String(b);
    }
    boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    
}
