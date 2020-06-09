package HashTable;

import java.util.HashSet;

public class CheckNAndItsDoubleExists1346 {
    class Solution {
        public boolean checkIfExist(int[] arr) {
            HashSet<Integer> numbers = new HashSet<>();
            for(int i=0;i< arr.length; i++){
                if (numbers.contains(arr[i]*2) || arr[i] % 2 == 0  && numbers.contains(arr[i]/2)){
                    return true;
                }
                numbers.add(arr[i]);
            }
            return false;
        }
    }
}
