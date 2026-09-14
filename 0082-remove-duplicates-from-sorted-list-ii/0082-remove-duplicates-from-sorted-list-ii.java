class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode i = head;
        ListNode j = head;
        
        while (j != null) {
            int cnt = 0;
            
            // FIX: Check j != null instead of j.next != null to process the tail safely
            while (j != null && i.val == j.val) {
                cnt++;
                j = j.next;
            }
            
            if (cnt > 1) {
                i = j; // Skip duplicates
            } else {
                temp.next = i;
                temp = i;
                i = j; // Advance i to j
            }
        }
        
        temp.next = null; // Cut off trailing references
        return dummy.next;
    }
}
