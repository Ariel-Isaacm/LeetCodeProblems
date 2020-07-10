package Misc;

import java.util.HashMap;
import java.util.Map;

public class FindTheJudge997 {
    class Solution {
        public int findJudge(int N, int[][] trust) {
            if (N == 1) return 1;
            HashMap<Integer, Integer> trusted = new HashMap<>(); // could be replaced with an array for performance
            HashMap<Integer, Boolean> trustSomeone = new HashMap<>();
            for (int i = 0; i < trust.length; i++) {
                trustSomeone.put(trust[i][0], true);
                if (trusted.containsKey(trust[i][1])) {
                    int count = trusted.get(trust[i][1]);
                    trusted.put(trust[i][1], ++count);
                } else {
                    trusted.put(trust[i][1], 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : trusted.entrySet()) {
                if (entry.getValue() == N - 1 && trustSomeone.get(entry.getKey()) == null) {
                    return entry.getKey();
                }
            }
            return -1;

        }
    }
}
