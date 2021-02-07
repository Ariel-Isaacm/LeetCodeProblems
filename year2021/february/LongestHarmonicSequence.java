class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> memo = new HashMap();
        for(int i=0; i<nums.length; i++){
            int value = 0;
            if(memo.containsKey(nums[i])){
                value = memo.get(nums[i]);
            }
            memo.put(nums[i], ++value);
        }
        int ans= 0;
        for(Map.Entry<Integer, Integer> entry: memo.entrySet()){
            if(memo.containsKey(entry.getKey()+1)){
                ans = Math.max(entry.getValue() + memo.get(entry.getKey()+1), ans);
            }
        }   
        return ans;
    }
}
