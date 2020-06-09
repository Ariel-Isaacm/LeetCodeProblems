package Array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAllDuplicatesInArray442 {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            HashMap<Integer,Integer> numMap = new HashMap<Integer, Integer>();
            for(int i=0;i<nums.length; i++){
                if(numMap.containsKey(nums[i])){
                    int times = numMap.get(nums[i]);
                    numMap.put(nums[i], ++times);
                }else {
                    numMap.put(nums[i], 1);
                }
            }

            return numMap.entrySet().stream().filter(p-> p.getValue() >1)
                    .map(Map.Entry::getKey).collect(Collectors.toList());
        }
    }
}
