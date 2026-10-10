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
        ListNode i = head;
        ListNode j= head;
        if(head == null ) return head;
        for (int m = 0 ; m < n ; m++){
            j = j.next;
        }
        if (j == null)return head.next;
        while(j.next != null){
            i = i.next ;
            j = j.next;
        }
        i.next = i.next.next;
        return head;
    }
}