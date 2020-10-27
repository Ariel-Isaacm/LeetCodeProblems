package October2020.week4;

import Misc.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleII142 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null) return null;
            Set<ListNode> nodes = new HashSet<>();
            while (head != null) {
                if (nodes.contains(head.next)) {
                    return head.next;
                }
                nodes.add(head);
                head = head.next;
            }
            return null;
        }
    }
}
