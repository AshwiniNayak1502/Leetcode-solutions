class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        } 
    }
    Node head;
    int size;
    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(index==i)
                return temp.val;
         temp=temp.next;
         i++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        size++;
    }
    
    public void addAtTail(int val) {
        Node n=new Node(val);
        if(head==null)
            head=n;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
         }
         size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        if(index==0){
            addAtHead(val);
            return;
        }
      
        Node temp=head;
        Node n=new Node(val);
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        if(index==0){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
