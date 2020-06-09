package LinkedList;

public class ReverseLinkedList206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null) return null;
            if (head.next == null) return head;

            ListNode previous = null;
            ListNode current = head;

            while (current != null) {
                ListNode aux = current.next;
                current.next = previous;
                previous = current;
                current = aux;
            }
            return previous;

        }
    }
}
