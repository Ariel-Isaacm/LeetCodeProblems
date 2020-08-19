package Array;

import java.util.HashSet;

public class DistributeCandies575 {
    class Solution {
        public int distributeCandies(int[] candies) {
            HashSet<Integer> nums = new HashSet<>();
            for (int i = 0; i < candies.length; i++) {
                nums.add(candies[i]);
            }
            return Math.min(nums.size(), candies.length / 2);
        }
    }
}
