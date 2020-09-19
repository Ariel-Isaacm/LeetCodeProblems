package DynamicProgramming;

public class CoinChange322 {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            if (amount < 1) return 0;
            return coinChange(coins, amount, new int[amount + 1]);
        }

        private int coinChange(int[] coins, int target, int[] memo) {
            if (target < 0) return -1;
            if (target == 0) return 0;
            if (memo[target] != 0) return memo[target];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < coins.length; i++) {
                int curr = coinChange(coins, target - coins[i], memo);
                if (curr >= 0 && curr < min) {
                    min = 1 + curr;
                }
            }
            memo[target] = min == Integer.MAX_VALUE ? -1 : min;
            return memo[target];
        }

    }
}
