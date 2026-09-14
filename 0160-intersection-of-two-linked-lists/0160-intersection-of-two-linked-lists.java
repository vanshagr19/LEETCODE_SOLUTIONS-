/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        ListNode t1 = h1;
        ListNode t2 = h2;
        int s1 = 0;
        int s2 = 0;
        while (t1 != null) {
            t1 = t1.next;
            s1++;
        }
        while (t2 != null) {
            t2 = t2.next;
            s2++;
        }
        int k;
        t1 = h1;
        t2 = h2;
        if (s1 > s2) {
            k = s1 - s2;
            for (int i = 0; i < k; i++) {

                t1 = t1.next;
            }
        } else {
            k = s2 - s1;
            for (int i = 0; i < k; i++) {

                t2 = t2.next;
            }
        }

        while (t1 != null) {
            if (t1 == t2) {
                return t1;
            }
            t1 = t1.next;
            t2 =t2.next;

        }
        return null;
    }
}