class RideSharingSystem {
    Queue<Integer> riders;
    Queue<Integer> drivers;
    Set<Integer> a_riders;
    public RideSharingSystem() {
        riders=new LinkedList<>();
        drivers=new LinkedList<>();
        a_riders=new HashSet<>();
    }
    
    public void addRider(int riderId) {
        riders.offer(riderId);
        a_riders.add(riderId);
    }
    
    public void addDriver(int driverId) {
        drivers.offer(driverId);
    }
    
    public int[] matchDriverWithRider() {
        while(!a_riders.contains(riders.peek())&&!riders.isEmpty()){
            riders.poll();
        }
        if(riders.isEmpty()||drivers.isEmpty())
        {
            return new int[]{-1,-1};
        }
        int driver=drivers.poll();
        int rider =riders.poll();
        a_riders.remove(rider);
        return new int[]{driver,rider};
    }
    
    public void cancelRider(int riderId) {
        a_riders.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */
