package year2020.December2020;;

public class IncreasingTriplets443 {
    class Solution {
        public boolean increasingTriplet(int[] nums) {
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            for (int n : nums) {
                if (n <= first)
                    first = n;
                else if (n <= second)
                    second = n;
                else return true;
            }
            return false;
        }
    }
}
