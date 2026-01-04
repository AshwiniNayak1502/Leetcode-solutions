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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        int i=1;
        int length=0;
        ListNode l=head;
        while(l!=null){
            l=l.next;
            length++;
        }
        k= k % length;
       
        while(i<=k){
            ListNode temp=null;
            ListNode last=head;
            while(last.next!=null){
            temp=last;
            last=last.next;
           }
            temp.next=null;
            last.next=head;
            head=last;
            i++;
        }
        return head;
    }
}
