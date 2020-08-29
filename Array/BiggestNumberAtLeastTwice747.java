package Array;

public class BiggestNumberAtLeastTwice747 {
    class Solution {
        public int dominantIndex(int[] nums) {
            if (nums == null || nums.length == 0) return -1;
            if (nums.length == 1) return 0;
            int first;
            int second;
            if (nums[0] > nums[1]) {
                first = 0;
                second = 1;
            } else {
                first = 1;
                second = 0;
            }
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] > nums[first]) {
                    second = first;
                    first = i;
                } else if (nums[i] > nums[second]) {
                    second = i;
                }
            }
            return nums[first] >= nums[second] * 2 ? first : -1;
        }
    }
}
