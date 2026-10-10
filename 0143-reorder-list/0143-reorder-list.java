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
    public ListNode reverse (ListNode head){
        ListNode prev = null ;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        return prev ;
    }
    public ListNode middle  (ListNode head){
        ListNode i = head;
        ListNode j = head.next ;
        while( j!= null && j.next != null){
            i = i.next ;
            j= j.next.next ;
        }
        return i;
    }
    public void reorderList(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode mid = middle(head);
        ListNode b = mid.next;
        mid.next = null;
        ListNode a = reverse(b);
        ListNode t1 = head ;
        ListNode t2 = a ;
        ListNode temp = d1;
        while(t2 != null){
            temp.next = t1;
            temp =t1 ;
            t1 = t1.next ;
            temp.next = t2 ;
            temp = t2 ;
            t2 = t2.next ;
        }
        if(t1 != null) {temp.next = t1;
            temp =t1 ;
            t1 = t1.next ;}
            
        head = d1.next;
    }
}