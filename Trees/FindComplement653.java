package Trees;

import Misc.TreeNode;

import java.util.HashSet;

public class FindComplement653 {
    class Solution {
        public boolean findTarget(TreeNode root, int k) {
            HashSet<Integer> numSet = new HashSet();
            helper(root, numSet);
            if(numSet.size() == 1){ return false;}
            //O(n) space and time
            for(int num : numSet){
                int complement = k-num;
                if(numSet.contains(complement) && complement != num) return true;
            }
            return false;
        }

        public void helper(TreeNode root, HashSet nums){
            if(root != null){
                nums.add(root.val);
                helper(root.left, nums);
                helper(root.right, nums);
            }
        }
    }
}
