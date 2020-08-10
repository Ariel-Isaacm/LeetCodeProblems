package Array;

public class RemoveDuplicatesFromArray26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
            int j = 1;
            int i = 0;
            while (j < nums.length) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
                j++;
            }
            return i + 1;
        }
    }
}
