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
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t1 = d1;
        ListNode t2 = d2;
        ListNode i = head;
        while (i != null) {
            if (i.val < x) {
                t1.next = i;
                t1 = i;
            } else {
                t2.next = i;
                t2 = i;
            }
            i = i.next;
        }
        t1.next = null;
        t2.next = null;
        t1.next = d2.next;
        return d1.next;
    }
}