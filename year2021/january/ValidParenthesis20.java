package year2021.january;

import java.util.Stack;

public class ValidParenthesis20 {
    class Solution {
        public boolean isValid(String s) {
            if (s == null || s.length() == 0) return true;
            Stack<Character> brackets = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char curr = s.charAt(i);
                if (curr == '(' || curr == '{' || curr == '[') {
                    brackets.push(curr);
                } else {
                    if (!brackets.isEmpty()) {
                        char prev = brackets.pop();
                        if (curr == ')' && prev != '(') {
                            return false;
                        } else if (curr == '}' && prev != '{') {
                            return false;
                        } else if (curr == ']' && prev != '[') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return brackets.isEmpty();
        }
    }
}
