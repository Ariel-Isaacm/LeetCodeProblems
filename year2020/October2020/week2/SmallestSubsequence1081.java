package year2020.October2020.week2;

public class SmallestSubsequence1081 {
    class Solution {
        public String removeDuplicateLetters(String s) {
            int[] chars = new int[26];
            for (int i = 0; i < s.length(); i++) {
                if (chars[s.charAt(i) - 'a'] == 0) {
                    chars[s.charAt(i) - 'a'] = 1;
                } else {
                    chars[s.charAt(i) - 'a'] = 0;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (chars[i] == 1) {
                    sb.append((char) (i + 'a'));
                }
            }
            return sb.toString();
        }
    }
}
