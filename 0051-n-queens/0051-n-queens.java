class Solution {

    public static List<List<String>> ans;

    public static boolean isSafe(int row,int col,char[][] arr,int n) {
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q')
                return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueen(int row,char[][] arr,int n){
        if(row==n){
            List<String> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder s=new StringBuilder();
                for(int j=0;j<n;j++){
                    s.append(arr[i][j]);
                }
                l.add(new String(s));
            }
            ans.add(l);
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(row,i,arr,n)){
                arr[row][i]='Q';
                nQueen(row+1,arr,n);
                arr[row][i]='.'; 
            }
            
        }
        
    } 
    public List<List<String>> solveNQueens(int n) {
        char[][] arr=new char[n][n];
        ans=new ArrayList<>();
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j]='.';

        
       
            nQueen(0,arr,n);
        
        return ans;
    }
}