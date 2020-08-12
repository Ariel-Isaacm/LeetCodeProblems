package Trees;

import Misc.TreeNode;

public class IsReversedTree951 {
    class Solution {
        public boolean flipEquiv(TreeNode root1, TreeNode root2) {
            return helper(root1, root2);
        }

        private boolean helper(TreeNode root1, TreeNode root2) {
            if ((root1 == null && root2 != null) || (root2 == null && root1 != null)) return false;
            if (root1 != null && root2 != null) {
                if (root1.val != root2.val) {
                    return false;
                }
                return helper(root1.right, root2.left) && helper(root1.left, root2.right) || // is reversed ?
                        helper(root1.left, root2.left) && helper(root1.right, root2.right);  // is exactly the same ?
            }
            return true;
        }
    }
}
