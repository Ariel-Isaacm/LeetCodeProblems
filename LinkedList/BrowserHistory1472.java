package LinkedList;

public class BrowserHistory1472 {
    class BrowserHistory {

        public class ListNode {
            String val;
            ListNode next;
            ListNode previous;
            ListNode(String val) { this.val = val; }
        }

        ListNode history;

        public BrowserHistory(String homepage) {
            history = new ListNode(homepage);
        }

        public void visit(String url) {
            // what would happen if  we hit the same url twice? Probably we should add a hash/cache
            history.next = new ListNode(url);
            history.next.previous = history;
            history = history.next;
        }

        public String back(int steps) {
            int moved = 0;
            while (history.previous != null && moved < steps){
                history = history.previous;
                moved++;
            }
            return history.val;
        }

        public String forward(int steps) {
            int moved = 0;
            while (history.next != null && moved < steps){
                history = history.next;
                moved++;
            }
            return history.val;
        }
    }

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
}
