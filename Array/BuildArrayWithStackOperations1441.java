package Array;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStackOperations1441 {
    class Solution {
        public List<String> buildArray(int[] target, int n) {
            int index = 0;
            List<String> ans = new ArrayList<>();
            for (int i = 1; i <= n && index < target.length; i++) {
                ans.add("Push");
                if (target[index] == i) {
                    index++;
                } else {
                    ans.add("Pop");
                }
            }
            return ans;
        }
    }
}
