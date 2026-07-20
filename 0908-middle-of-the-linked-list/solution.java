/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        // int i=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     temp=temp.next;
        //     i++;
        // }
        // int j=0;
        // temp=head;
       
        // while(j<((i/2))){
        //     temp=temp.next;
        //     j++;
        // }
        // return temp;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null  && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    
    }
}
