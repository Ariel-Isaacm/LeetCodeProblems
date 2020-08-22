package String;

public class RansomNote383 {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            if (ransomNote != null || magazine != null && ransomNote.length() > magazine.length()) {
                return false;
            }
            int[] letters = new int[26];
            for (int i = 0; i < magazine.length(); i++) {
                letters[magazine.charAt(i) - 'a']++;
            }
            for (int i = 0; i < ransomNote.length(); i++) {
                letters[ransomNote.charAt(i) - 'a']--;
                if (letters[ransomNote.charAt(i) - 'a'] < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
