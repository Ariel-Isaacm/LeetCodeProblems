package Array;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences1207 {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            if (arr.length < 3) return false;
            HashMap<Integer,Integer> ocur = new HashMap<>();
            for(int i=0; i<arr.length;i++){
                if(ocur.containsKey(arr[i])){
                    ocur.put(arr[i],ocur.get(arr[i])+1);
                } else {
                    ocur.put(arr[i], 1);
                }
            }
            HashSet<Integer> ocurrItems = new HashSet<>();
            for (Integer value : ocur.values()) {
                ocurrItems.add(value);
            }

            return ocurrItems.size() == ocur.size();

        }
    }
}
