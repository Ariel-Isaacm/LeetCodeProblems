package Array;

public class RotatedArray33 {
    class Solution {
        public int search(int[] nums, int target) {
            // this can be improved by doing an enhanced binary search by finding the offset
            for(int i=0; i<nums.length; i++){
                if(nums[i] == target) return i;
            }
            return -1;
        }
    }
}
