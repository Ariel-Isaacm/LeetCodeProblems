package Array;

public class MoveZeroes283 {
    class Solution {
        public void moveZeroes(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    int newIndex = findNextNonZeroIndex(i, nums);
                    if (newIndex > 0) {
                        nums[i] = nums[newIndex];
                        nums[newIndex] = 0;
                    } else {
                        // we finished
                        break;
                    }
                }
            }

        }

        public int findNextNonZeroIndex(int start, int[] nums) {
            for (int i = start; i < nums.length; i++) {
                if (nums[i] != 0) {
                    return i;
                }
            }
            return -1;
        }
    }
}
