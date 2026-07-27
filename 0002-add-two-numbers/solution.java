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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        int sum;
        while (l1 != null || l2 != null) {
            if (l2 == null) {
                sum = l1.val + carry;
                l1 = l1.next;
            }
            else if (l1 == null) {
                sum = l2.val + carry;
                l2 = l2.next;
            } else {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }

            carry = sum / 10;
            ListNode temp = new ListNode(sum % 10);
            cur.next = temp;
            cur = temp;

        }

        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            cur.next = temp;
            cur = temp;
        }

        return dummy.next;
    }

}
