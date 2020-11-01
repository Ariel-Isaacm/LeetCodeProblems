package November2020;

import Misc.ListNode;

public class ConvertLinkedListToNumber1290 {
    class Solution {

        public int getDecimalValue(ListNode head) {
            ListNode node = head;
            int factor = -1;
            while (node != null) {
                factor++;
                node = node.next;
            }
            int ans = 0;
            while (head != null) {
                ans += head.val * Math.pow(2, factor--);
                head = head.next;
            }
            return ans;
        }
    }
}
