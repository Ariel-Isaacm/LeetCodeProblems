package Misc;

public class XorInRange1310 {
    class Solution {
        public int[] xorQueries(int[] arr, int[][] queries) {
            int[] xor = new int[queries.length];
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] ^ arr[i];
            }
            for (int i = 0; i < queries.length; i++) {
                if (queries[i][0] == 0) {
                    xor[i] = arr[queries[i][1]];
                } else {
                    xor[i] = arr[queries[i][1]] ^ arr[queries[i][0] - 1];
                }
            }
            return xor;
        }
    }
}
