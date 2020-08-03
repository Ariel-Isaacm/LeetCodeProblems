package Trees;

import Misc.TreeNode;

public class SearchInBST700 {
    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            return helper(root, val);
        }

        private TreeNode helper(TreeNode root, int val) {
            if (root == null) return null;
            if (root.val == val) {
                return root;
            }
            if (root.val > val) {
                return helper(root.left, val);
            } else {
                return helper(root.right, val);
            }
        }
    }
}
