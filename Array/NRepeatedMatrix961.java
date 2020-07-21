package Array;

public class NRepeatedMatrix961 {
    class Solution {
        public int repeatedNTimes(int[] A) {
            int[] nums = new int[10000];
            for (int i = 0; i < A.length; i++) {
                nums[A[i]]++;
                if (nums[A[i]] == A.length / 2) return A[i];
            }
            return -1;
        }
    }
}
