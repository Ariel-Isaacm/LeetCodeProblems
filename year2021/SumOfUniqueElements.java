class Solution {
  // a sorting approach would be better for memory but wanted to maximize time.
    public int sumOfUnique(int[] nums) {
        Set<Integer> numSet = new HashSet();
        for(int i =0; i<nums.length; i++){
            if(numSet.contains(nums[i])){
                numSet.remove(nums[i]);
            } else {
                numSet.add(nums[i]);
            }
        }
        Iterator<Integer> it = numSet.iterator();
        int ans =0;
        while(it.hasNext()){
            ans+=it.next();
        }
        return ans;
    }
}
