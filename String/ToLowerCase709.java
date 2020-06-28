package String;

public class ToLowerCase709 {
    class Solution {
        public String toLowerCase(String str) {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c > 64 && c < 91) {
                    ans.append((char) (c + 32));
                } else {
                    ans.append(c);
                }
            }
            return ans.toString();
        }
    }
}
