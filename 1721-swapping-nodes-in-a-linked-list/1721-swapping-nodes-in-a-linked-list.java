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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow =head ;
        ListNode fast = head;
        ListNode ptr =null;
        for(int i = 0;i<k-1 ; i++){
            if (fast == null){
                return null;
            }
            fast =fast.next;
        }
        ptr= fast;
        while(fast.next != null){
            slow= slow.next;
            fast = fast.next;
        }
        int temp = 0;
        temp = ptr.val;
        ptr.val = slow.val;
        slow.val = temp;
        return head;
    }
}