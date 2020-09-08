package Trees;

import Misc.TreeNode;

public class SumRootToLeaf129 {
    class Solution {
        public int sumNumbers(TreeNode root) {
            if (root == null) return 0;
            return helper(root, "");
        }

        //todo instead of a string we could use an integer and multiply it by 10 by each call
        public int helper(TreeNode node, String s) {
            if (node == null) return 0;
            int ans = 0;
            if (node.left == null && node.right == null) return Integer.parseInt(s + node.val);
            ans += helper(node.left, s + node.val);
            ans += helper(node.right, s + node.val);
            return ans;
        }
    }
}
