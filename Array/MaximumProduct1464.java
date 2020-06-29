package Array;

public class MaximumProduct1464 {
    class Solution {
        public int maxProduct(int[] nums) {
            if (nums.length < 2) {
                return 0;
            }
            int i = 0;
            int j = 0;

            for (int x = 0; x < nums.length; x++) {
                if (i < nums[x]) {
                    j = i;
                    i = nums[x];
                } else if (j < nums[x]) {
                    j = nums[x];
                }
            }
            return (i - 1) * (j - 1);
        }
    }
}
