package year2020.November2020;

import java.util.Arrays;

public class SearchInSortedArray81 {
    class Solution {
        public boolean search(int[] nums, int target) {
            // not really the most elegant solution but still lol
            Arrays.sort(nums);
            return Arrays.binarySearch(nums, target) > -1;
        }
    }
}
