package Trees;

import Misc.TreeNode;

public class PathToSum112 {
    class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            if (root == null) return false;
            return helper(root, sum);
        }

        private boolean helper(TreeNode node, int target) {
            if (node != null) {
                if (node.left == null & node.right == null && target - node.val == 0) return true;
                return helper(node.left, target - node.val) || helper(node.right, target - node.val);
            } else {
                return false;
            }
        }
    }
}
