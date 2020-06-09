package Array;

public class MissingNumber268 {
    class Solution {
        public int missingNumber(int[] nums) {
            if (nums == null || nums.length == 0) return 0;
            if (nums.length == 1) return nums[0] == 0 ? nums[0] + 1 : nums[0] - 1;
            int sum = 0;
            int max = 0;

            for (int i : nums) {
                sum += i;
                if (max < i) {
                    max = i;
                }

            }
            if (max == nums.length - 1) {
                return max + 1;
            }
            int sumMax = max * (max + 1) / 2;

            return sumMax - sum;
        }
    }
}
