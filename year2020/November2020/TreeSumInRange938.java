package year2020.November2020;

import Misc.TreeNode;

public class TreeSumInRange938 {
    class Solution {
        public int rangeSumBST(TreeNode root, int L, int R) {
            return helper(root, L, R);
        }

        public int helper(TreeNode node, int L, int R) {
            int ans = 0;
            if (node != null) {
                if (node.val <= R && node.val >= L) {
                    ans += node.val;
                }
                if (node.val <= R) {
                    ans += helper(node.right, L, R);
                }
                if (node.val >= L) {
                    ans += helper(node.left, L, R);
                }
            }
            return ans;
        }
    }
}
