package Trees;

import Misc.TreeNode;

public class SumRootToLeaf129 {
    class Solution {
        public int sumNumbers(TreeNode root) {
            if (root == null) return 0;
            return helper(root, 0);
        }

        public int helper(TreeNode node, int s) {
            if (node == null) return 0;
            int ans = 0;
            s *= 10;
            if (node.left == null && node.right == null) return s + node.val;
            ans += helper(node.left, s + node.val);
            ans += helper(node.right, s + node.val);
            return ans;
        }
    }
}
