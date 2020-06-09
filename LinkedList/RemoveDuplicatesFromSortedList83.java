package LinkedList;

public class RemoveDuplicatesFromSortedList83 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode pointer = head;
            while (pointer.next != null) {
                if (pointer.val == pointer.next.val) {
                    pointer.next = pointer.next.next;
                } else {
                    pointer = pointer.next;
                }
            }
            return head;
        }
    }
}
