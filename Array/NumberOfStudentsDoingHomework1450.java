package Array;

public class NumberOfStudentsDoingHomework1450 {
    class Solution {
        public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
            // O(n) time complexity, O(1) space complexity
            int ans = 0;
            for(int i = 0; i < startTime.length; i++){
                if(startTime[i] <= queryTime){
                    ans++;
                }
                if(endTime[i] < queryTime){
                    ans--;
                }
            }
            return ans;
        }
    }
}
