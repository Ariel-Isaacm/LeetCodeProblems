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
  
  public int sumOfUnique(int[] nums) {
	int[] freq = new int[101];
	for (int num : nums)
		freq[num]++;

	int sum = 0;
	for (int i = 0; i < freq.length; i++)
		if (freq[i] == 1)
			sum += i;

	return sum;
}
}
