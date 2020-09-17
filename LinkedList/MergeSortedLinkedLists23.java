package LinkedList;

import Misc.ListNode;

public class MergeSortedLinkedLists23 {
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            //probably a divide and conquer approach would be better off than going for all of the lists an once
            if (lists == null || lists.length == 0) return null;

            ListNode ans = null;
            ListNode curr = null;


            boolean notNullValues = true;
            while (notNullValues) {
                notNullValues = false;
                ListNode smallest = null;
                int smallestIndex = -1;

                for (int i = 0; i < lists.length; i++) {
                    if (lists[i] != null) notNullValues = true;
                    if (lists[i] != null && smallest == null) {
                        smallest = lists[i];
                        smallestIndex = i;
                    } else if (smallest != null && lists[i] != null && lists[i].val < smallest.val) {
                        smallest = lists[i];
                        smallestIndex = i;
                    }
                }
                if (notNullValues) {
                    if (curr == null) {
                        curr = smallest;
                    } else {
                        curr.next = smallest;
                        curr = curr.next;
                    }
                    lists[smallestIndex] = lists[smallestIndex].next;
                    if (ans == null) ans = curr;
                }


            }
            return ans;
        }
    }
}
