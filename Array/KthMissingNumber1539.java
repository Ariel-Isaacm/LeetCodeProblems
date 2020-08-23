package Array;

public class KthMissingNumber1539 {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            boolean[] nums = new boolean[arr[arr.length - 1] + k + 1];
            for (int i = 0; i < arr.length; i++) {
                nums[arr[i]] = true;
            }

            for (int i = 1; i < nums.length; i++) {
                if (!nums[i]) {
                    k--;
                    if (k == 0) return i;
                }
            }
            return -1;
        }
    }
}
