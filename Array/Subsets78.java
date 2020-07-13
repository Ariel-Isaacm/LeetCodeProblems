package Array;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList();
            for (int i = 0; i < nums.length; i++) {
                int size = ans.size();
                for (int j = 0; j < size; j++) {
                    List<Integer> helper = new ArrayList(ans.get(j));
                    helper.add(nums[i]);
                    ans.add(helper);
                }

                List<Integer> curr = new ArrayList();
                curr.add(nums[i]);
                ans.add(curr);
            }
            ans.add(new ArrayList());
            return ans;
        }
    }
}
