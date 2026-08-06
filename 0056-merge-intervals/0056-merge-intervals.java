class Solution {
   public int[][] merge(int[][] intervals) {
        if(intervals.length==1){
            return intervals;
        }
       Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int prev=0;
        int curr;
        ArrayList<int[]> ans=new ArrayList<>();
        ans.add(new int[]{intervals[prev][0],intervals[prev][1]});
        for(int i=1;i<intervals.length;i++){
            int[] arr=ans.get(ans.size()-1);
            if(arr[1]>=intervals[i][0]){
                if(arr[1]>=intervals[i][1]){
                    continue;
                }
                else{
                    ans.add(new int[]{ans.get(ans.size()-1)[0],intervals[i][1]});
                    ans.remove(ans.size()-2);
                }
                
            }
            else{
                ans.add(new int[]{intervals[i][0],intervals[i][1]});
            }
        }

        return ans.toArray(new int[ans.size()][]);
        
    }
}