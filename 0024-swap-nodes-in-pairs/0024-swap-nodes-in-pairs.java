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
    public ListNode swapPairs(ListNode head) {

        if (head ==null || head.next == null) return head;    
        ListNode slow =head;
        ListNode fast = head.next;
        ListNode fasth = fast;
           
        while(fast != null && fast.next !=null){
            slow.next = fast.next;
            slow = slow.next;

            fast.next =fast.next.next;
            fast = fast.next;
        }
        slow.next =null;
        slow = head;
        fast = fasth;
        ListNode dummy = new ListNode(-1);
        ListNode d = dummy ;
        while( fast != null && slow != null){
            d.next = fast ;
            d = fast ;
            fast =fast.next;
            d.next = slow;
            d = slow ;
            slow = slow.next;
        }
        return dummy.next;

    }
}