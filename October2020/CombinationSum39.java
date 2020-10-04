package October2020;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            helper(candidates, target, ans, 0, new ArrayList<>());
            return ans;
        }


        private int helper(int[] candidates, int target, List<List<Integer>> ans, int index, List<Integer> currList) {
            if (target == 0) return 0;
            if (target < 0) return -1;
            for (int i = index; i < candidates.length; i++) {
                List<Integer> aux = new ArrayList<>(currList);
                aux.add(candidates[i]);
                int curr = helper(candidates, target - candidates[i], ans, i, aux);
                if (curr == 0) {
                    ans.add(aux);
                }
            }
            return -1;
        }
    }
}
