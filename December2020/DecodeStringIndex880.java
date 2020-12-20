package December2020;

public class DecodeStringIndex880 {
    class Solution {
        public String decodeAtIndex(String S, int K) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            StringBuilder curr = new StringBuilder();
            for (char c : S.toCharArray()) {
                if (Character.isDigit(c)) { // this needs to be updated to numbers bigger than 9
                    String newWord = curr.toString();
                    curr = new StringBuilder();
                    for (int i = 0; i < Character.getNumericValue(c); i++) {
                        sb.append(newWord);
                    }
                    if (sb.length() >= K - 1) {
                        return sb.toString().charAt(K - 1) + "";
                    }
                } else {
                    curr.append(c);
                }
            }
            return null;
        }
    }
}
