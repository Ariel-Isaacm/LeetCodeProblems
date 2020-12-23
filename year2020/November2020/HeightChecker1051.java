package year2020.November2020;

import java.util.Arrays;

public class HeightChecker1051 {
    class Solution {
        public int heightChecker(int[] heights) {
            int copy[] = heights.clone();
            Arrays.sort(copy);
            int height = 0;

            for (int i = 0; i < copy.length; i++) {
                if (copy[i] != heights[i]) {
                    height++;
                }
            }
            return height;
        }
    }
}
