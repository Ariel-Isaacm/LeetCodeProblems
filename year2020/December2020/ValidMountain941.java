package year2020.December2020;;

public class ValidMountain941 {
    class Solution {
        public boolean validMountainArray(int[] A) {
            int N = A.length;
            int i = 0;

            while (i + 1 < N && A[i] < A[i + 1])
                i++;

            if (i == 0 || i == N - 1)
                return false;

            while (i + 1 < N && A[i] > A[i + 1])
                i++;

            return i == N - 1;
        }
    }
}
