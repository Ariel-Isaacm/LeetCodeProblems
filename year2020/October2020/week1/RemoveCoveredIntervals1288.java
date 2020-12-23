package year2020.October2020.week1;

public class RemoveCoveredIntervals1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        int ans = intervals.length;
        boolean[] isProcessed = new boolean[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length; j++) {
                if (intervals[j][0] <= intervals[i][0] && intervals[j][1] >= intervals[i][1] && !isProcessed[i] && i != j) {
                    ans--;
                    isProcessed[i] = true;
                    break;
                }
            }
        }
        return ans;
    }
}
