
class Solution {
    public ListNode mid(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        ListNode p =mid(head);
        ListNode nexthead = p.next;
        p.next =null;

        ListNode revhead = reverse(nexthead);

        ListNode a = head;
        ListNode b = revhead;

        int minimum = Integer.MIN_VALUE;
        while(a != null){
            int sum = a.val + b.val;
            minimum = Math.max(minimum,sum);
            a =a.next;
            b=b.next;
        }
        return minimum;
    }
}