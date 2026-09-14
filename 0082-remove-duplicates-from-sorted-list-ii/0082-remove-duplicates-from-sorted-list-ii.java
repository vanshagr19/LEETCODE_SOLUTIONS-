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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy =new ListNode(-1);
        ListNode temp =dummy;
        ListNode i =head;
        ListNode j =head;
        
        if (head ==null|| head.next == null) return head;
        while(j != null){
            int cnt =0;
            while(  j != null && i.val == j.val){
                cnt ++;
                j = j.next;
            }
            if (cnt>1){
                i=j;
                
            }
            else{
                temp.next = i;
                temp = i;
                i =j;
            }
        }

        temp.next =null;
        return dummy.next;
    }
}