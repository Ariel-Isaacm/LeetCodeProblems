package October2020;

import java.util.HashSet;

public class KDiffPairs532 {
    class Solution {
        public int findPairs(int[] nums, int k) {
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> dup = new HashSet<>();
            int ans = 0;

            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])) {
                    if (k == 0 && !dup.contains(nums[i])) {
                        ans++;
                        dup.add(nums[i]);
                    }
                } else {
                    if (k != 0 && set.contains(nums[i] + k)) {
                        ans++;
                    }
                    if (k != 0 && set.contains(nums[i] - k)) {
                        ans++;
                    }
                }
                set.add(nums[i]);
            }
            return ans;

        }
    }
}
