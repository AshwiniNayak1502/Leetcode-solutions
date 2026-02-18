class Twitter {
    HashMap<Integer,List<int[]>> tweets;
    HashMap<Integer,HashSet<Integer>> followers;    
    int time;

    public Twitter() {
        tweets=new HashMap<>();
        followers=new HashMap<>();
        time=0;
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!tweets.containsKey(userId)){
            tweets.put(userId,new ArrayList<>());
        }
        tweets.get(userId).add(new int[]{tweetId,time++});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)->b[1]-a[1]
        );
        if(tweets.containsKey(userId)){
            for(int[] t:tweets.get(userId)){
                pq.add(t);
            }
        }
        if(followers.containsKey(userId)){
            for(int f:followers.get(userId)){
                if(tweets.containsKey(f)){
                    for(int[] t:tweets.get(f)){
                        pq.add(t);
                    }
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        int count=0;
        while(!pq.isEmpty()&&count<10){
            ans.add(pq.poll()[0]);
            count++;
        }
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
       if(!followers.containsKey(followerId)){
            followers.put(followerId, new HashSet<>());
       }
       followers.get(followerId).add(followeeId);
        
    }
    
    public void unfollow(int followerId, int followeeId) {
       if(followers.containsKey(followerId)){
            followers.get(followerId).remove(followeeId);
       }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
