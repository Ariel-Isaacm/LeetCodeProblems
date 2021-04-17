class Solution {
    public int fib(int n) {
        Integer[] memo = new Integer[n+1];
        return fib(n, memo);
    }
    
    private int fib(int n, Integer[] memo){
        if(n == 1) return 1;
        if(n == 0) return 0;
        if(memo[n] !=null){
            return memo[n];
        }
        
        memo[n] = fib(n-1, memo) + fib(n-2, memo);
        return memo[n];
    }
}
