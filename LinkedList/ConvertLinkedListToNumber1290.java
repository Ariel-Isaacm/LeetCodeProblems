package LinkedList;

public class ConvertLinkedListToNumber1290 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
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
