package November2020;

import Misc.ListNode;

public class InsertionSortList147 {
    class Solution {
        public ListNode insertionSortList(ListNode head) {
            ListNode pointer = new ListNode();
            ListNode curr = head, prevNode, nextNode;

            while (curr != null) {
                prevNode = pointer;
                nextNode = pointer.next;

                while (nextNode != null) {
                    if (curr.val < nextNode.val)
                        break;
                    prevNode = nextNode;
                    nextNode = nextNode.next;
                }
                ListNode nextIter = curr.next;
                curr.next = nextNode;
                prevNode.next = curr;

                curr = nextIter;
            }

            return pointer.next;
        }
    }
}
