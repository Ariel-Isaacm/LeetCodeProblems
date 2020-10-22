package October2020.week4;

import Misc.TreeNode;

public class MinimumDepthBinaryTree111 {
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) return 0;
            return min(root, 1);
        }

        private int min(TreeNode node, int level) {
            if (node == null) return Integer.MAX_VALUE;
            if (node.left == null && node.right == null) return level;
            return Math.min(min(node.left, level + 1), min(node.right, level + 1));
        }
    }
}
