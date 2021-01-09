package year2021.january;

public class CheckIfTwoStringArraysAreEquivalent1662 {
    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            return String.join("", word1).equals(String.join("", word2));
        }
    }
}
