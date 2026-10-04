class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = null;
        
        while(curr != null){
            nxt = curr.next ;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public ListNode remove(ListNode head){
        ListNode i = head;
        ListNode j = head.next;

        while(i.next!=null &&j != null){
            if (j.val >= i.val){
                i.next = j ;
                i=j;
                
            }
            j=j.next;
        }
        i.next = j;
        return head;

    }
    public ListNode removeNodes(ListNode head) {
        ListNode tail = reverse(head);
        ListNode a = remove(tail);
        return reverse(a);        
    }
}