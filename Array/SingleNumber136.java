package Array;

public class SingleNumber136 {

    class Solution {
        public int singleNumber(int[] nums) {
            int xor = 0;
            // by using xor operation remove the duplicate bits leaving the unique bits, under the assumption that only 1 number is unique
            for(int i=0; i<nums.length;i++){
                xor ^=nums[i];
            }
            return xor;
        }
    }
}
