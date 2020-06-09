package Misc;

public class PalindromeNumber9 {
    // also called capicua/palindromic number
    class Solution {
        public boolean isPalindrome(int x) {
            if(x<0) return false;
            if(x<10) return true;
            String s = String.valueOf(x);
            for(int i=1; i<=s.length()/2; i++){
                if(s.charAt(i-1) != s.charAt(s.length()-i)){
                    return false;
                }
            }
            return true;
        }
    }
}
