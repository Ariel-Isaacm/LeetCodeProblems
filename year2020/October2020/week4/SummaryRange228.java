package year2020.October2020.week4;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange228 {
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            if (nums == null || nums.length == 0) return new ArrayList<>();
            List<String> ans = new ArrayList<>();
            int low = nums[0];
            int target = low + 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != target) {
                    ans.add(getString(low, target));
                    low = nums[i];
                    target = low + 1;
                } else {
                    target++;
                }
            }
            ans.add(getString(low, target));

            return ans;
        }

        private String getString(int low, int target) {
            if (low == target - 1) {
                return String.valueOf(low);
            } else {
                return low + "->" + (target - 1);
            }
        }
    }
}
