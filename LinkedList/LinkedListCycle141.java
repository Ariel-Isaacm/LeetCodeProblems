package LinkedList;

import Misc.ListNode;

public class LinkedListCycle141 {

    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) return false;
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast != null && fast.next != null) {
                if (slow.val == fast.val) return true;
                slow = slow.next;
                fast = fast.next.next;
            }
            return false;
        }
    }
}
