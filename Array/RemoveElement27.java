package Array;

public class RemoveElement27 {
    class Solution {
        public int removeElement(int[] nums, int val) {
            for (int i = 0; i < nums.length; i++) {
                if (val == nums[i]) {
                    int newIndex = findNextIndex(nums, val, i + 1);
                    if (newIndex == -1) {
                        return i;
                    }
                    nums[i] = nums[newIndex];
                    nums[newIndex] = val;
                }
            }
            return nums.length;
        }

        private int findNextIndex(int[] nums, int val, int i) {
            for (; i < nums.length; i++) {
                if (nums[i] != val) {
                    return i;
                }
            }
            return -1;
        }
    }

    // this solution instead of revisiting  the whole array for the next non == val element we pick up the search where we last left it
    // making the time complexity to o(n) instead  of n^2
    //    public int removeElement(int[] nums, int val) {
    //        int previousIndex = -1;
    //        for (int i = 0; i < nums.length; i++) {
    //            if (val == nums[i]) {
    //                int newIndex = findNextIndex(nums, val, i + 1, previousIndex);
    //                if (newIndex == -1) {
    //                    return i;
    //                }
    //                nums[i] = nums[newIndex];
    //                nums[newIndex] = val;
    //                 previousIndex = newIndex;
    //            }
    //        }
    //        return nums.length;
    //    }
    //
    //    private int findNextIndex(int[] nums, int val, int i, int previousIndex) {
    //        i = Math.max(previousIndex, i);
    //        for (; i < nums.length; i++) {
    //            if (nums[i] != val) {
    //                return i;
    //            }
    //        }
    //        return -1;
    //    }
}
