package year2020.November2020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindow239 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            List<Integer> result = new ArrayList<>();
            LinkedList<Integer> indexes = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                while (indexes.size() > 0 && indexes.getFirst() <= i - k)
                    indexes.removeFirst();
                while (indexes.size() > 0 && nums[i] >= nums[indexes.getLast()])
                    indexes.removeLast();
                indexes.addLast(i);
                if (i >= k - 1)
                    result.add(nums[indexes.getFirst()]);
            }

            return result.stream().mapToInt(x -> x).toArray();
        }
    }
}
