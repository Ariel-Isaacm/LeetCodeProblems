package Trees;

import Misc.TreeNode;

public class IsSameTree100 {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            return doubleDfs(p, q);
        }

        public boolean doubleDfs(TreeNode p, TreeNode q) {
            if ((p == null && q != null) || (p != null && q == null)) return false;
            if (p == null && q == null) return true;
            if (p.val != q.val) return false;
            return doubleDfs(p.left, q.left) && doubleDfs(p.right, q.right);
        }
    }
}
