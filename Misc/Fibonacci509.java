package Misc;

import java.util.HashMap;

public class Fibonacci509 {
    class Solution {
        public int fib(int N) {
            return fib(N, new HashMap<>());
        }

        // this becomes O(N)
        public int fib(int n, HashMap<Integer, Integer> memo) {
            if (memo.containsKey(n)) {
                return memo.get(n);
            }
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            int n1 = fib(n - 1, memo) + fib(n - 2, memo);
            memo.put(n, n1);
            return n1;
        }

        // this is bad, O(2^n)
        //    public int fib(int N) {
        //        if(N == 0){
        //            return 0;
        //        }
        //        if(N == 1){
        //            return 1;
        //        }
        //        return fib(N-1) + fib(N-2);
        //    }
    }
}
