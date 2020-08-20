package String;

public class ExcelSheetColumnNumber171 {
    class Solution {
        public int titleToNumber(String s) {
            if (s == null || s.isEmpty()) return -1;
            int ans = 0;
            int pow = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                ans += (s.charAt(i) - 64) * Math.pow(26, pow);
                pow++;
            }
            return ans;
        }
    }
}
