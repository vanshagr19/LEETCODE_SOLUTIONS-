class Solution {
    public ListNode Merge(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(-1);
        ListNode t1 = h1;
        ListNode t2 = h2;
        ListNode d = dummy;

        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                d.next = t1;
                t1 = t1.next;
            } else {
                d.next = t2;
                t2 = t2.next;
            }
            d = d.next;
        }

        if (t1 != null) {
            d.next = t1;
        } else {
            d.next = t2;
        }

        return dummy.next;
    }

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode slownxt = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slownxt);

        return Merge(left, right);
    }
}
