package year2020.October2020.week2;

public class BinarySearch704 {
    class Solution {
        public int search(int[] nums, int target) {
            int index, low = 0, high = nums.length - 1;
            while (low <= high) {
                index = low + (high - low) / 2;
                if (nums[index] == target) return index;
                if (target < nums[index]) {
                    high = index - 1;
                } else {
                    low = index + 1;
                }
            }
            return -1;
        }
    }
}
