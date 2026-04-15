class BrowserHistory {
    List<String> browsehist;
    int current=-1;
    public BrowserHistory(String homepage) {
        browsehist=new ArrayList<>();
        browsehist.add(homepage);
        current=0;
    }
    
    public void visit(String url) {
        while(browsehist.size()!=current+1){
            browsehist.remove(browsehist.size()-1);
        }
        browsehist.add(url);
        current++;
    }
    
    public String back(int steps) {
        current-=steps;
        if(current<0) current=0;
        return browsehist.get(current);
    }
    
    public String forward(int steps) {
        current+=steps;
        if(current>=browsehist.size())   current=browsehist.size()-1;
        return browsehist.get(current);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
