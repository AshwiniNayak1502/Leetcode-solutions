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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0); 
        dummy.next=head;
        ListNode end=dummy;
        ListNode del=dummy;
       
        for (int i=0;i<=n;i++){
            end=end.next;
        }
        while(end!=null){
            end=end.next;
            del=del.next;
        }
        del.next=del.next.next;
        return dummy.next;
        
    }
}
