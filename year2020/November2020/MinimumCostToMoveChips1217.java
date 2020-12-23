package year2020.November2020;

public class MinimumCostToMoveChips1217 {
    class Solution {
        public int minCostToMoveChips(int[] position) {
            int even_cnt = 0;
            int odd_cnt = 0;
            for (int i : position) {
                if (i % 2 == 0) {
                    even_cnt++;
                } else {
                    odd_cnt++;
                }
            }
            return Math.min(odd_cnt, even_cnt);
        }
    }
}
