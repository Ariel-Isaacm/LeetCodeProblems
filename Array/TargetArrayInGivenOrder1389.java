package Array;

import java.util.ArrayList;
import java.util.List;

public class TargetArrayInGivenOrder1389 {
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            // probably not the best approach? do we want to sacrifice memory or time?
            // todo not comfortable with this solution, linked list and play with the pointers as we insert the elements and then empty it in an
            // todo array? or play with the array in-place and make it more time consuming?
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
