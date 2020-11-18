package November2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {
    class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length == 0 || intervals.length == 1) {
                return intervals;
            }

            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

            List<int[]> ans = new ArrayList<>();

            for (int[] interval : intervals) {
                if (ans.size() == 0) {
                    ans.add(interval);
                } else {
                    int[] lastInterval = ans.get(ans.size() - 1);
                    if (lastInterval[1] >= interval[0]) {
                        int maxEnd = Math.max(lastInterval[1], interval[1]);
                        int start = lastInterval[0];

                        ans.remove(ans.size() - 1);
                        ans.add(new int[]{start, maxEnd});
                    } else {
                        ans.add(interval);
                    }
                }
            }

            return ans.toArray(new int[ans.size()][2]);

        }
    }
}
