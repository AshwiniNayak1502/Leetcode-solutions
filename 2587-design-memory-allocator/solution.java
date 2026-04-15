class Allocator {
        int[] arr;
        HashMap<Integer,List<Integer>> map;
        int start;
        int end;

    public Allocator(int n) {
        map=new HashMap<>();
        arr= new int[n];
        start=0;
        end=start+1;
    }
    
    public int allocate(int size, int mID) {
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                 start=i;
                 end=start+1;
                while(end<arr.length&&end-start!=size&&arr[end]==0){
                    end++;
                }
                if(end-start==size){
                    res=start;
                    while(start<end){
                        arr[start]=mID;
                        if(!map.containsKey(mID))    map.put(mID,new ArrayList<>());
                        map.get(mID).add(start);
                        start++;
                    }
                    break;
                }
            }   
        }
        return res;
    }
    
    public int freeMemory(int mID) {
        if(!map.containsKey(mID)) return 0;
        int res=map.get(mID).size();
        for(int i:map.get(mID)){
            arr[i]=0;
        }
        map.remove(mID);
        return res;
    }
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.freeMemory(mID);
 */
