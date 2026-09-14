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
    public static int length(ListNode head){
        ListNode temp =head;
        int length = 0;
        while(temp != null){
            length++;
            temp=temp.next;
        }
        return length;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow =head;
        ListNode a =null;
        ListNode fast =head;
        int len = length(head);
        if (head == null || head.next ==null  ) return head;
        k = k % len;
        if (k == 0) return head;
        for (int i =0;i<k ;i++){
            fast =fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast =fast.next;
        }
        a = slow.next;
        ListNode b =a;
        slow.next =null;
        while(b.next != null){
            b= b.next;
        }
        b.next = head;
        return a;
    }
}