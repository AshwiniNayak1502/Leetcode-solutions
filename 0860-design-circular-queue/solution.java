class MyCircularQueue {
    int[] cq;
    int size;
    int front;
    int rear;
    int count;
    public MyCircularQueue(int k) {
        size=k;
        cq=new int[size];
        front=0;
        rear=-1;
        count=0;
    }
    
    public boolean enQueue(int value) {
        if(count==size){
            return false;
        }
        rear=(rear+1)%size;
        cq[rear]=value;
        count+=1;
        return true;
    }
    
    public boolean deQueue() {
        if(count==0){
            return false;
        }
        front=(front+1)%size;
        count-=1;
        return true;
    }
    
    public int Front() {
        if(count==0)
            return -1;
        return cq[front];
    }
    
    public int Rear() {
        if(count==0)
            return -1;
        return cq[rear];
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return count==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
