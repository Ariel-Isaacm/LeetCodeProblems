package Array;

import java.util.Arrays;

public class BoatsToSavePeople881 {
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int j = people.length -1;
            int i = 0;
            int ans = 0;

            while(i <= j){
                ans++;
                if(people[i] + people[j] <= limit){
                    i++;
                }
                j--;
            }
            return ans;
        }
    }
}
