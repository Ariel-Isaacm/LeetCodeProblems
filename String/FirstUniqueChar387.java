package String;

import java.util.HashMap;

public class FirstUniqueChar387 {
    class Solution {
        public int firstUniqChar(String s) {
            HashMap<Character, Integer> ocur = new HashMap<>();
            for(int i=0;  i<s.length(); i++){
                if(ocur.containsKey(s.charAt(i))){
                    ocur.put(s.charAt(i),ocur.get(s.charAt(i)) + 1);
                }else{
                    ocur.put(s.charAt(i), 1);
                }
            }
            for(int i=0;  i<s.length(); i++){
                if(ocur.get(s.charAt(i)) <2){
                    return i;
                }
            }
            return -1;

        }
    }
}
