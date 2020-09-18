package DynamicProgramming;

public class ClimbingStairs70 {
    class Solution {
        public int climbStairs(int n) {
            return climb(n, new int[46]);
        }

        private int climb(int n, int[] memo) {
            if (memo[n] > 0) {
                return memo[n];
            }
            if (n == 1) {
                return 1;
            } else if (n == 2) {
                return 2;
            }
            memo[n] = climb(n - 1, memo) + climb(n - 2, memo);
            return memo[n];
        }
    }
}
