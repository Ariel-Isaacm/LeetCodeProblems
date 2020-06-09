package Array;

import java.util.HashSet;

public class IntersectionOfTwoArrays349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> numsSet = new HashSet<>();
            HashSet<Integer> ans = new HashSet<>();
            for(int i=0; i< nums1.length;i++){
                numsSet.add(nums1[i]);
            }
            for(int i=0; i < nums2.length; i++){
                if (numsSet.contains(nums2[i])){
                    ans.add(nums2[i]);
                }
            }
            int[] x = new int[ans.size()];
            int j = 0;
            for(Object foo: ans.toArray()){
                x[j++] = (int) foo;
            }
            return x;

        }
    }
}
