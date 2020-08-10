package Misc;

import java.util.PriorityQueue;

public class KthBiggestElement215 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            if (nums == null || nums.length == 0 || k < 1) return -1;
            PriorityQueue<Integer> heap = new PriorityQueue<>();
            for (int i = 0; i < nums.length; i++) {
                heap.add(nums[i]);
                if (heap.size() > k) {
                    heap.poll();
                }
            }
            return heap.peek();
            //If we want to minimize memory and we're comfortable sacrificing time we could do
            // Arrays.sort(nums);
            // return nums[nums.length -k];
        }
    }
}
