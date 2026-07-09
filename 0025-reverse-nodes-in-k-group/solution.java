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
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode dummy=new ListNode(0);
      dummy.next=head;
      ListNode t=dummy;
      ListNode grpPrev=dummy;
      while(true){
        int i=0;
        while(i<k&&t!=null){
            t=t.next;
            i++;
        }

        if(t==null)
            break;

        ListNode nextNode=t.next;
        ListNode prev=nextNode;
        ListNode curr=grpPrev.next;
        while(curr!=nextNode){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        ListNode temp=grpPrev.next;
        grpPrev.next=t;
        temp.next=nextNode;
        grpPrev=temp;
        t=grpPrev;
      }  
      return dummy.next;
    }
}
