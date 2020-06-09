package String;

public class RotateStringIII557 {
    class Solution {
        public String reverseWords(String s) {
            String[] words = s.split(" ");
            String ans ="";
            for(int i = 0;i < words.length; i++){
                for(int j = words[i].length()-1; j>=0; j--){
                    ans+= words[i].charAt(j);
                }
                ans+=" ";
            }
            return ans.trim();
        }
    }
}
