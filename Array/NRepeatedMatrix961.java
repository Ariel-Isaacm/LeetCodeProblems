package Array;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedMatrix961 {
    class Solution {
        public int repeatedNTimes(int[] A) {
            Map<Integer, Integer> count = new HashMap();
            for (int x: A) {
                count.put(x, count.getOrDefault(x, 0) + 1);
            }

            for (int k: count.keySet())
                if (count.get(k) > 1)
                    return k;

            return -1;
        }
    }
}
