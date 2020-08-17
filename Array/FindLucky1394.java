package Array;

import java.util.HashMap;
import java.util.Map;

public class FindLucky1394 {
    class Solution {
        public int findLucky(int[] arr) {
            HashMap<Integer, Integer> numbers = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                numbers.put(arr[i], numbers.getOrDefault(arr[i], 0) + 1);
            }
            int ans = -1;

            for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
                if (entry.getValue().equals(entry.getKey()) && ans < entry.getValue()) {
                    ans = entry.getValue();
                }
            }
            return ans;
        }
    }

}
