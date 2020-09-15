package Trees;

import Misc.TreeNode;

public class ValidateBinarySearchTree98 {
    class Solution {
        public boolean isValidBST(TreeNode root) {
            if (root == null) return true;
            return dfs(root, null, null);
        }

        private boolean dfs(TreeNode node, Integer lower, Integer upper) {
            if (node == null) return true;

            int val = node.val;
            if (lower != null && val <= lower) {
                return false;
            }
            if (upper != null && val >= upper) {
                return false;
            }

            if (!dfs(node.right, val, upper)) {
                return false;
            }
            return dfs(node.left, lower, val);
        }
    }
}
