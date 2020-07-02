package Misc;

public class NumberOfSteps1342 {
    class Solution {
        public int numberOfSteps(int num) {
            if (num == 0) return 0;
            int ans = 0;
            while (num > 0) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num--;
                }
                ans++;
            }
            return ans;
        }
    }
}
