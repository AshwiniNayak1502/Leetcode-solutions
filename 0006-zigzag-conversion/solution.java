class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||s.length()<numRows){
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }       
        int currow=0;
        boolean godown=false;
        for(char c:s.toCharArray()){
            rows[currow].append(c);

            if(currow==0||currow==numRows-1){
                godown=!godown;
            }

            currow+=godown?1:-1;

        }

        StringBuilder res=new StringBuilder();
        for(StringBuilder row:rows){
            res.append(row);
        }

        return res.toString();
    }
}
