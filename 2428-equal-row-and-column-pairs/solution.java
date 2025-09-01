class Solution {
    public int equalPairs(int[][] grid) {
      int n=grid.length;
      HashMap<String,Integer> rowM=new HashMap<>();
      for(int i=0;i<n;i++){
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<n;j++){
            sb.append(grid[i][j]).append(",");
        }
        String row=sb.toString();
        rowM.put(row,rowM.getOrDefault(row,0)+1);
      }
      HashMap<String,Integer> colM=new HashMap<>();
      int count=0;
      for(int j=0;j<n;j++){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(grid[i][j]).append(",");
        }
        String col=sb.toString();
        count+=rowM.getOrDefault(col,0);
      }
      return count;
        
    }
}
