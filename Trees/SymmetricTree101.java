package Trees;

import Misc.TreeNode;

public class SymmetricTree101 {
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return doubleDfs(root, root);
        }

        private boolean doubleDfs(TreeNode n1, TreeNode n2) {
            if (n1 == null && null == n2) {
                return true;
            } else if (n1 == null || n2 == null) return false;
            if (n1.val != n2.val) return false;
            return doubleDfs(n1.left, n2.right) && doubleDfs(n1.right, n2.left);
        }
    }
}
