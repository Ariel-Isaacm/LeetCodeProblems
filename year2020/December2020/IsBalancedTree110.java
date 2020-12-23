package year2020.December2020;;

import Misc.TreeNode;

public class IsBalancedTree110 {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            int left = level(root.left);
            int right = level(root.right);
            if (Math.abs(left - right) > 1) {
                return false;
            }
            return isBalanced(root.right) && isBalanced(root.left);
        }

        private int level(TreeNode node) {
            if (node == null) return 0;
            int left = level(node.left);
            int right = level(node.right);
            return Math.max(left, right) + 1;
        }
    }
}
