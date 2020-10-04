package October2020;

import java.util.LinkedList;

public class RecentCalls933 {
    class RecentCounter {
        LinkedList<Integer> state;

        public RecentCounter() {
            state = new LinkedList<>();
        }

        public int ping(int t) {
            state.addLast(t);
            while (state.size() > 0) {
                if (state.peek() < t - 3000) {
                    state.poll();
                } else {
                    break;
                }
            }
            return state.size();
        }
    }

}
