package October2020.week1;

import Misc.ListNode;

public class RotateLinkedList61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;
        int size = getSize(head);
        int times = k % size;

        ListNode zero = new ListNode();
        zero.next = head;

        ListNode slow = zero.next;
        ListNode fast = zero.next;
        for (int i = 0; i < times; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = zero.next;
        zero.next = slow.next;
        slow.next = null;

        return zero.next;

    }

    private int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    // first answer being naive
    //class Solution {
    //    public ListNode rotateRight(ListNode head, int k) {
    //        if (head == null) return null;
    //        if (head.next == null) return head;
    //        int size = getSize(head);
    //        int times = size > k ? k : k % size;
    //
    //        ListNode zero = new ListNode();
    //        zero.next = head;
    //        for (int i = 0; i < times; i++) {
    //            ListNode aux = zero.next;
    //            while (aux.next.next != null) {
    //                aux = aux.next;
    //            }
    //            aux.next.next = zero.next;
    //            zero.next = aux.next;
    //            aux.next = null;
    //
    //        }
    //        return zero.next;
    //    }
    //
    //    private int getSize(ListNode head){
    //        int size=0;
    //        while(head != null){
    //            size++;
    //            head = head.next;
    //        }
    //        return size;
    //    }
    //}
}
