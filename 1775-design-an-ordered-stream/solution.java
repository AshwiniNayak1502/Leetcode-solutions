class OrderedStream {
    String[] res;
    int ptr=0;
    public OrderedStream(int n) {
        res=new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        res[idKey-1]=value;
        List<String> li=new ArrayList<>();
        while(ptr<res.length&&res[ptr]!=null){
            li.add(res[ptr]);
            ptr++;
        }
        return li;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
