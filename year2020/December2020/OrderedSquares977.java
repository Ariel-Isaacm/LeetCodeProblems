package year2020.December2020;;

import java.util.Arrays;

public class OrderedSquares977 {
    class Solution {
        public int[] sortedSquares(int[] A) {
            return Arrays.stream(A).map(n-> n*n).sorted().toArray();
        }
    }
}
