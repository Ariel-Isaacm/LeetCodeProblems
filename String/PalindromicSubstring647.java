package String;

import java.util.HashSet;

public class PalindromicSubstring647 {
    class Solution {
        public int countSubstrings(String s) {
            HashSet<String> palindromes = new HashSet<>();
            int ans = 0;
            for(int i=0; i < s.length(); i++){
                for(int j=i+1; j< s.length()+1; j++){
                    String word = s.substring(i,j);
                    if (palindromes.contains(word) || isPalindrome(word)){
                        palindromes.add(word);
                        ans++;
                    }
                }
            }
            return ans;
        }

        private boolean isPalindrome(String s){
            if(s.length() == 1) return true;
            for(int i = 0; i< s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)){
                    return false;
                }
            }
            return true;
        }
    }
}
