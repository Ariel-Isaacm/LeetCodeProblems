package Trees;

import Misc.TreeNode;

public class RemoveTargetLeaves1325 {
    class Solution {
        public TreeNode removeLeafNodes(TreeNode node, int target) {
            helper(node, target);
            if (node != null && node.val == target && node.left == null && node.right == null) {
                return null;
            }
            return node;
        }

        public void helper(TreeNode node, int target) {
            if (node != null) {
                helper(node.left, target);
                helper(node.right, target);
                if (node.left != null && node.left.val == target && node.left.left == null && node.left.right == null) {
                    node.left = null;

                }
                if (node.right != null && node.right.val == target && node.right.left == null && node.right.right == null) {
                    node.right = null;

                }
            }
        }
    }
}
