package October2020.week2;

import Misc.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList148 {
    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null) return null;
            List<Integer> aux = new ArrayList<>();
            while (head != null) {
                aux.add(head.val);
                head = head.next;
            }
            Collections.sort(aux);
            ListNode root = new ListNode(aux.get(0));
            ListNode curr = root;
            for (int i = 1; i < aux.size(); i++) {
                curr.next = new ListNode(aux.get(i));
                curr = curr.next;
            }
            return root;
        }
    }
}
