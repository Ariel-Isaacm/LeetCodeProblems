package year2021.january;

import Misc.TreeNode;

public class FindTargetInClone1379 {

    class Solution {
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            if (original == null || cloned == null || target == null) return null;
            return dfs(target, cloned);
        }

        private TreeNode dfs(TreeNode target, TreeNode node) {
            if (node == null) return null;
            if (node.val == target.val) return node;
            TreeNode ans = dfs(target, node.left);
            return ans == null ? dfs(target, node.right) : ans;
        }
    }
}
