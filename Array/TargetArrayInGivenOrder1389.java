package Array;

import java.util.ArrayList;
import java.util.List;

public class TargetArrayInGivenOrder1389 {
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            // probably not the best approach? do we want to sacrifice memory or time?
            if (nums == null || nums.length < 1) return null;
            int[] ans = new int[nums.length];
            List<Integer> aux = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                aux.add(index[i], nums[i]);
            }
            for (int i = 0; i < aux.size(); i++) {
                ans[i] = aux.get(i);
            }
            return ans;
        }
    }
}
