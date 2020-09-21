package LinkedList;

import Misc.ListNode;

public class RemoveNthElementFromEnd19 {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode base = new ListNode(0);
            base.next = head;
            ListNode curr = base;
            ListNode slow = base;
            for (int i = 1; i <= n + 1; i++) {
                curr = curr.next;
            }
            while (curr != null) {
                curr = curr.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return base.next;
        }
    }
}
