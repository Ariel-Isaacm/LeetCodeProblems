package Misc;

public class SubstractTheProduct1281 {
    class Solution {
        public int subtractProductAndSum(int n) {
//            class Solution {
//                public int subtractProductAndSum(int n) {
//                    if (n == 0) return 0;
//                    String s = String.valueOf(n);
//                    int ans = 1;
//                    int subs = 0;
//                    for (int i = 0; i < s.length(); i++){
//                        ans*=s.charAt(i) - 48;
//                        subs+=s.charAt(i) - 48;
//                    }
//                    return ans-subs;
//                }
//            }

            if (n == 0) return 0;
            int product = 1;
            int substraction = 0;
            while (n > 0){
                int module = n % 10;
                product *= module;
                substraction +=module;
                n /= 10;
            }
            return product - substraction;
        }
    }
}
