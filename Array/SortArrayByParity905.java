package Array;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayByParity905 {
    class Solution {
        public int[] sortArrayByParity(int[] A) {
            return Arrays.stream(A).boxed().sorted(Comparator.comparingInt(a -> a % 2))
                    .mapToInt(i->i).toArray();

        }
    }
}
