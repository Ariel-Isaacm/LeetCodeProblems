package Misc;

public class FindEvenDigits1295 {
    class Solution {
        public int findNumbers(int[] nums) {
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                // solution 1
                // if(String.valueOf(nums[i]).length()%2==0){
                //     ans++;
                // }
                // solution2
                // int size = 0;
                // int curr = nums[i];
                // do{
                //     size ++;
                //     curr /= 10;
                // } while(curr > 0);
                // if(size %2 == 0) ans++;
                // solution 3
                //100,000 <- maximum value according to constraints
                if ((nums[i] >= 10 && nums[i] <= 99) ||
                        nums[i] >= 1000 && nums[i] <= 9999 ||
                        nums[i] >= 100000 && nums[i] <= 999999
                ) {
                    ans++;
                }

            }
            return ans;
        }
    }
}
