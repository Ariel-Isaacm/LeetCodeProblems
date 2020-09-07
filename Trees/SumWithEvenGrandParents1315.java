package Trees;

import Misc.TreeNode;

public class SumWithEvenGrandParents1315 {
    class Solution {
        public int sumEvenGrandparent(TreeNode root) {
            if (root == null) return 0;
            return helper(root, null, null);
        }

        public int helper(TreeNode root, TreeNode parent, TreeNode grandParent) {
            if (root == null) return 0;
            int ans = 0;
            ans += helper(root.left, root, parent);
            ans += helper(root.right, root, parent);
            if (grandParent != null && grandParent.val % 2 == 0) ans += root.val;
            return ans;
        }
    }
}
