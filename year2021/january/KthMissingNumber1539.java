package year2021.january;

public class KthMissingNumber1539 {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            boolean[] nums = new boolean[arr[arr.length - 1] + k + 1];
            for (int i = 0; i < arr.length; i++) {
                nums[arr[i]] = true;
            }

            for (int i = 1; i < nums.length; i++) {
                if (!nums[i]) {
                    k--;
                    if (k == 0) return i;
                }
            }
            return -1;
        }
    }
    //This solution involves a time complexity of O(n+k) and space complexity of O(1)
    //class Solution {
    //    public int findKthPositive(int[] arr, int k) {
    //        int i = 0;
    //        int order = 1;
    //        while(i < arr.length){
    //            if(order == arr[i]){
    //                i++;
    //            } else {
    //                k--;
    //                if(k==0) return order;
    //
    //            }
    //            order++;
    //        }
    //        return order+k-1;
    //    }
    //}
}
