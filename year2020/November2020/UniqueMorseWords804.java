package year2020.November2020;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseWords804 {
    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                    "....", "..", ".---", "-.-", ".-..", "--", "-.",
                    "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                    "...-", ".--", "-..-", "-.--", "--.."};

            Set<String> seen = new HashSet<String>();
            for (String word : words) {
                StringBuilder code = new StringBuilder();
                for (char c : word.toCharArray())
                    code.append(MORSE[c - 'a']);
                seen.add(code.toString());
            }

            return seen.size();
        }
    }
}
