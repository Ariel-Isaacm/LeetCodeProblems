package Misc;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers728 {
    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> ans = new ArrayList<>();
            for(int i= left; i<=right; i++){
                String current = String.valueOf(i);
                if(isSelfDividing(current, i)){
                    ans.add(i);
                }

            }
            return ans;
        }

        public boolean isSelfDividing(String current, int i){
            for(int j=0; j<current.length();j++){
                char c = current.charAt(j);
                if (c == '0' || (i % (c - '0') > 0)) return false;
            }
            return true;
        }
    }
}
