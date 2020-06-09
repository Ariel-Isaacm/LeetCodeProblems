package HashTable;

import java.util.HashMap;
import java.util.Map;

public class TwoNums1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> numsMap = new HashMap();
            for(int i = 0; i< nums.length; i++){
                if (numsMap.containsKey(target - nums[i])){
                    return new int[]{numsMap.get(target - nums[i]), i};
                } else {
                    numsMap.put(nums[i],i);
                }
            }
            throw new RuntimeException("Target wasn't reached");
        }
    }
}
