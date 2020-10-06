package October2020;

import Misc.TreeNode;

public class InsertIntoBST701 {
    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            } else {
                if (root.val < val) {
                    root.right = insertIntoBST(root.right, val);
                } else {
                    root.left = insertIntoBST(root.left, val);
                }
            }
            return root;
        }
    }
}
