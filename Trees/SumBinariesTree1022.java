package Trees;

import Misc.TreeNode;

public class SumBinariesTree1022 {
    class Solution {
        public int sumRootToLeaf(TreeNode root) {
            return helper(root, 0);
        }

        private int helper(TreeNode node, int val) {
            if (node == null) return 0;
            val = val * 2 + node.val;
            if (node.left == null && node.right == null) return val;
            int ans = 0;
            ans += helper(node.left, val);
            ans += helper(node.right, val);
            return ans;
        }
    }
}
