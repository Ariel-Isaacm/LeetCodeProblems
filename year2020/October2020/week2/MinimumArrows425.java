package year2020.October2020.week2;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumArrows425 {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            if (points.length == 0) return 0;
            Arrays.sort(points, Comparator.comparingInt(p -> p[1]));
            int startingPoint = points[0][1];
            int arrows = 1;
            for (int i = 1; i < points.length; i++) {
                if (points[i][0] <= startingPoint) {
                    continue;
                }
                arrows++;
                startingPoint = points[i][1];
            }
            return arrows;
        }
    }
}
