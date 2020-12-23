package year2020.October2020.week3;

import java.util.HashSet;

public class MinimumDominoes1007 {
    class Solution {
        public int minDominoRotations(int[] A, int[] B) {
            HashSet<Integer> aSet = new HashSet<>();
            HashSet<Integer> bSet = new HashSet<>();
            for (int i = 0; i < A.length; i++) {
                aSet.add(A[i]);
                bSet.add(B[i]);
            }
            return Math.min(minDomino(A, B, aSet), minDomino(B, A, bSet));
        }

        private int minDomino(int[] A, int[] B, HashSet<Integer> set) {
            int ans = Integer.MAX_VALUE;
            for (int curr : set) {
                int min = 0;
                for (int i = 0; i < A.length; i++) {
                    if (A[i] != curr) {
                        if (B[i] == curr) {
                            min++;
                        } else {
                            min = Integer.MAX_VALUE;
                            break; //  can't do the swap;
                        }

                    }
                }
                ans = Math.min(ans, min);
            }
            return ans == Integer.MAX_VALUE ? -1 : ans;
        }
    }
}
